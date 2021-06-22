package com.carcenter.api.repository;


import com.carcenter.api.entities.Mecanicos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.carcenter.api.entities.ViewFacturacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ViewFacturacionRepository extends JpaRepository <ViewFacturacion, Long> {
	
 @Query("from ViewFacturacion e where e.documento=:documento")
	 ViewFacturacion getBuscarFac(@Param("documento") String documento);
}
