package com.Duoc.RecetaYa.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "recetas")

@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Recetas {
    @Id 

    private String id;

    private String nombre;

    private String descripcion;

    private int total;
}