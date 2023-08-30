package com.example.turismoapp.Servicios;

import com.example.turismoapp.Respositorio.EmpresaRespositorio;
import com.example.turismoapp.Respositorio.OfertaRespositorio;
import com.example.turismoapp.Validaciones.EmpresaValidaciones;
import com.example.turismoapp.modelos.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpresaServicio {
    @Autowired
    EmpresaRespositorio EmpresaRepositorio;
    @Autowired
    EmpresaValidaciones EmpresaValidacion;

    public Local registrarEmpresa(Local datosARegistrar) throws Exception {
        return null;
    }

    public Local modificarEmpresa(Integer id, Local datosAModificar) throws Exception {
        try {
            if (this.EmpresaValidacion.validarNombre(datosAModificar.getNombre())) {
                throw new Exception("error en el dato entregado");
            }
            Optional<Local> empresaEncontrada = this.EmpresaRepositorio.findById(id);
            if (empresaEncontrada.isEmpty()) {
                throw new Exception("empresa no encontrada");
            }
            Local empresaQueExiste = empresaEncontrada.get();

            empresaQueExiste.setNombre(datosAModificar.getNombre());

            return this.EmpresaRepositorio.save(empresaQueExiste);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
        public Local buscarEmpresaId (Integer id) throws Exception {
            try {
                Optional<Local>empresaOpcional=this.EmpresaRepositorio.findById(id);
                if (empresaOpcional.isEmpty()){
                    throw new Exception("empresa no encontrada");
                }
                return empresaOpcional.get();

            } catch (Exception error) {
                throw new Exception(error.getMessage());
            }
        }
        public List<Local> buscarEmpresas ()throws Exception {
           try {
            List<Local>listaEmpresa= this.EmpresaRepositorio.findAll();
            return listaEmpresa;

           }catch (Exception error){
               throw new Exception(error.getMessage());
           }

        }
        public Boolean eliminarEmpresa (Integer id) throws Exception {
            try {
                Optional<Local>empresaOpcional=this.EmpresaRepositorio.findById(id);
                if (empresaOpcional.isPresent()){
                    this.EmpresaRepositorio.deleteAll();
                    return true;

                }else {
                    throw new Exception("empresa no encontrada");
                }

            }catch (Exception error){
                throw new Exception(error.getMessage());
            }

        }
    }
