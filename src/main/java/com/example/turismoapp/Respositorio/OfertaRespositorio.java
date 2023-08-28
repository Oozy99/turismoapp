package com.example.turismoapp.Respositorio;

import com.example.turismoapp.modelos.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfertaRespositorio  extends JpaRepository<Oferta,Integer> {
}
