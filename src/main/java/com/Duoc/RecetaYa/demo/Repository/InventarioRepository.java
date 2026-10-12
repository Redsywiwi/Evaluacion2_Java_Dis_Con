package com.Duoc.RecetaYa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Duoc.RecetaYa.demo.Model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {    
}
