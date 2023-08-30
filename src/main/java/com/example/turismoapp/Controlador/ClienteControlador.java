package com.example.turismoapp.Controlador;

import com.example.turismoapp.Respositorio.EmpresaRespositorio;
import com.example.turismoapp.Respositorio.OfertaRespositorio;
import com.example.turismoapp.Servicios.EmpresaServicio;
import com.example.turismoapp.Servicios.OfertaServicio;
import com.example.turismoapp.modelos.Local;
import com.example.turismoapp.modelos.Oferta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cliente")
public class ClienteControlador {

    @Autowired
    OfertaServicio ofertaServicio;
    @Autowired
    OfertaRespositorio ofertaRespositorio;

    @PostMapping
    public ResponseEntity<?> registraOferta(@RequestBody Oferta datosARegistrar){
        return null;

    }

    @PostMapping
    public RequestEntity<?> modificarOferta(@RequestBody Oferta datosAModificar, @PathVariable Integer idOferta ){
        return  null;
    }

    @GetMapping
    public  RequestEntity<?> buscarUnaOfertaid(@PathVariable Integer id){
        return null;
    }

    @GetMapping
    public  RequestEntity<?> buscarTodasOferta(){
        return null;
    }
    @DeleteMapping
    public  ResponseEntity<?> eliminarOferta(@PathVariable Integer id){
        return null;
    }
}
