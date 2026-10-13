package com.Duoc.RecetaYa.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.Duoc.RecetaYa.demo.Model.Inventario;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends MongoRepository<Inventario, String> {    
}
