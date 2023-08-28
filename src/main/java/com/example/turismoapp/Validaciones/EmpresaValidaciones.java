package com.example.turismoapp.Validaciones;

import org.springframework.stereotype.Component;
@Component
public class EmpresaValidaciones {

    public Boolean validarNombre(String nombre) throws  Exception{
        if(nombre.length()>30){
            throw new Exception("longuitud de caracteres invalido");

        }else{
            return true;
        }
    }
}
