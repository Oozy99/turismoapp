package com.example.turismoapp.Respositorio;

import com.example.turismoapp.modelos.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRespositorio  extends JpaRepository<Local,Integer> {
}
