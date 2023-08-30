package com.example.turismoapp.Controlador;

import com.example.turismoapp.Respositorio.EmpresaRespositorio;
import com.example.turismoapp.Servicios.EmpresaServicio;
import com.example.turismoapp.modelos.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Empresas")
public class EmporesaControlador {
    @Autowired
    EmpresaServicio empresaServicio;
    @Autowired
    EmpresaRespositorio empresaRespositorio;
@PostMapping
    public ResponseEntity<?>registraEmpresa(@RequestBody Local datosARegistrar){
    return null;

    }
@PostMapping
    public RequestEntity<?> editarEmpresa(@RequestBody Local datosNuevosEmpresa,@PathVariable Integer idEmpresa ){
    return  null;
    }
    @GetMapping
    public  RequestEntity<?> buscarUnaEmpresa(@PathVariable Integer id){
    return null;
    }
    @GetMapping
    public  RequestEntity<?> buscarTodasEmpresas(){
    return null;
    }

    @DeleteMapping
    public  ResponseEntity<?> borrarEmpresa(@PathVariable Integer id){
    return null;
    }
}
