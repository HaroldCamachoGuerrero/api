package com.carcenter.api.repository;

import com.carcenter.api.entities.Mecanicos;
import com.carcenter.api.entities.MecanicosView;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ViewMecanicoRepository extends JpaRepository <MecanicosView, Long> {
	

}
