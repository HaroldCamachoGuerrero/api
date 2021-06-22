package com.carcenter.api.repository;


import com.carcenter.api.entities.Mecanicos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.carcenter.api.entities.ViewFacturacion;
import com.carcenter.api.entities.ViewRepuestos;
import com.carcenter.api.entities.ViewServicios;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ViewRepuestosRepository extends JpaRepository <ViewRepuestos, Long> {
	
 @Query("from ViewRepuestos e where e.documento=:documento ")
	 List<ViewRepuestos> getBuscarSer(@Param("documento") String documento);
}
