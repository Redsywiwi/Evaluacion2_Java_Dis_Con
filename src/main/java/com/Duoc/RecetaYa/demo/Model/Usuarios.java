package com.Duoc.RecetaYa.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "usuarios")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Usuarios {
    @Id 
    private String id;

    private String nombre;

    private String Appaterno;

    private String Apmaterno;

    private String Rut;

    private String correo;

    private int numerotelefonico;

    private String direccion;

}