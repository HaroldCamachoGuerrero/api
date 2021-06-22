package com.carcenter.api.repository;

import com.carcenter.api.entities.Mecanicos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MecanicosRepository extends JpaRepository <Mecanicos, Long> {
	
    @Query("from Mecanicos e where e.tipo_documento=:tipo_documento and e.documento=:documento")
	 Mecanicos getBuscaMecanico(@Param("tipo_documento") String tipo_documento,@Param("documento") String documento);
}
