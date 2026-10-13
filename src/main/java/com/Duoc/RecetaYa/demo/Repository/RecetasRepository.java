package com.Duoc.RecetaYa.demo.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.Duoc.RecetaYa.demo.Model.Recetas;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetasRepository extends MongoRepository<Recetas, String>{

}
