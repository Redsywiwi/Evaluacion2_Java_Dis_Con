package com.Duoc.RecetaYa.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Usuarios {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, length =  255)
    private String nombre;

    @Column  (nullable = false, length = 255)
    private String Appaterno;

    @Column (nullable = false, length = 255)
    private String Apmaterno;

    @Column (nullable = true, length = 15)
    private String Rut;


    @Column (nullable = false, length =  255)
    private String correo;

    @Column (nullable = true, length = 20)
    private int numerotelefonico;

    @Column (nullable = true, length = 255)
    private String direccion;

}