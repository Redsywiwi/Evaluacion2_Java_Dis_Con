package com.Duoc.RecetaYa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Duoc.RecetaYa.demo.Model.Dispensacion;


public interface DispensacionRepository extends JpaRepository<Dispensacion, Long> {

}
/* Esto no se toca, el jpa repository ya hace la pega del find all, find by id, save y delete by id :3c */