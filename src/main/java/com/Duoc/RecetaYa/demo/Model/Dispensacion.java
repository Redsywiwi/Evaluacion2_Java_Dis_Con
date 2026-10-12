package com.Duoc.RecetaYa.demo.Model;

import java.time.LocalDateTime;
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

public class Dispensacion{
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String productodispensado;

    @Column (nullable = false)
    private LocalDateTime fechadispensacion;

    @Column (nullable = false)
    private int cantidad;

    @Column (nullable = false)
    private int preiofinal;
}