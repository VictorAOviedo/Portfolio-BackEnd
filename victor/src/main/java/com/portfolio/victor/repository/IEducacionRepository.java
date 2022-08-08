package com.portfolio.victor.repository;

import com.portfolio.victor.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreEdu (String nombreEdu);
    public boolean existsByNombreEdu (String nombreEdu);
}