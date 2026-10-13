package com.Duoc.RecetaYa.demo.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.Duoc.RecetaYa.demo.Model.Usuarios;
import org.springframework.stereotype.Repository;

@Repository 
public interface UsuariosRepository extends MongoRepository<Usuarios, Long> {
    
}
