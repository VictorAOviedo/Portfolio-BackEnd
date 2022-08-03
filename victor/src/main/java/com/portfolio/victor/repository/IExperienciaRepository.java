package com.portfolio.victor.repository;

import com.portfolio.victor.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreExp (String nombreExp);
    public boolean existsByNombreExp (String nombreExp);
}
