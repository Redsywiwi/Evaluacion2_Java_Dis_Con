package com.Duoc.RecetaYa.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.Duoc.RecetaYa.demo.Model.Dispensacion;
import org.springframework.stereotype.Repository;

@Repository
public interface DispensacionRepository extends MongoRepository<Dispensacion, String> {

}
/* Esto no se toca, el Mongo repository ya hace la pega del find all, find by id, save y delete by id :3c */