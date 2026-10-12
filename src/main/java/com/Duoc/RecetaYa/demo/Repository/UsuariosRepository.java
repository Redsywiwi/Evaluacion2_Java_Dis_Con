package com.Duoc.RecetaYa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Duoc.RecetaYa.demo.Model.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    
}
