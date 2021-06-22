package com.carcenter.api.repository;


import com.carcenter.api.entities.Mecanicos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.carcenter.api.entities.ViewFacturacion;
import com.carcenter.api.entities.ViewServicios;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ViewServiciosRepository extends JpaRepository <ViewServicios, Long> {
	
 @Query("from ViewServicios e where e.documento=:documento ")
	 List<ViewServicios> getBuscarRep(@Param("documento") String documento);
}
