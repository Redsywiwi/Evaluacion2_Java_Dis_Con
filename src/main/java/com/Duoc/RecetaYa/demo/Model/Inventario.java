package com.Duoc.RecetaYa.demo.Model;

import java.time.LocalDate;
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

public class Inventario {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable=false)
    private String nombre;

    @Column (nullable = false)
    private int cantidad;

    @Column (nullable = false)
    private LocalDate fechaVencimiento;

    @Column (nullable = false, length = 25)
    private String unidadMedida;

    @Column (nullable = false, length = 75)
    private String categoria;

    @Column (nullable = false, length = 500)
    private String descripcion;

    @Column (nullable = false)
    private int precio;
}
