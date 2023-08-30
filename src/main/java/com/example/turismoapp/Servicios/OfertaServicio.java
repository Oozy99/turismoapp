package com.example.turismoapp.Servicios;

import com.example.turismoapp.Respositorio.OfertaRespositorio;
import com.example.turismoapp.Validaciones.EmpresaValidaciones;
import com.example.turismoapp.Validaciones.OfertaValidacion;
import com.example.turismoapp.modelos.Local;
import com.example.turismoapp.modelos.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OfertaServicio {

    @Autowired
    OfertaRespositorio ofertaRepositorio;

    @Autowired
    OfertaValidacion ofertaValidacion;

    public Oferta registrarOferta(Oferta datosARegistrar) throws Exception {
        try{

            if(!this.ofertaValidacion.validarNombre(datosARegistrar.getTitulo())){
                throw new Exception("error en el servicio");
            }

            return( this.ofertaRepositorio.save(datosARegistrar));

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Oferta modificarOferta(Integer id,Oferta datosAModificar) throws Exception{
        try {

            Optional<Oferta> ofertaEncontrada = this.ofertaRepositorio.findById(id);
            Oferta ofertaQueExiste = ofertaEncontrada.get();

            ofertaQueExiste.setTitulo(datosAModificar.getTitulo());
            ofertaQueExiste.setDescripcion(datosAModificar.getDescripcion());

            return (this.ofertaRepositorio.save(ofertaQueExiste));

        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }

    public Oferta buscarOfertaId(Integer id) throws Exception {
        try {
            Optional<Oferta> bucarOferta=this.ofertaRepositorio.findById(id);
            if (bucarOferta.isEmpty()){
                throw new Exception("empresa no encontrada");
            }
            return bucarOferta.get();

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Oferta> buscarOfertas() throws Exception {
        try {
            List<Oferta>litaOferta= this.ofertaRepositorio.findAll();
            return litaOferta;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Boolean eliminarOferta() throws Exception {
        return null;

    }
}