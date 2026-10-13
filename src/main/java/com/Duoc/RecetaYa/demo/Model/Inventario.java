package com.Duoc.RecetaYa.demo.Model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "inventario")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Inventario {
    @Id 
    private String id;

    private String nombre;

    private int cantidad;

    private LocalDate fechaVencimiento;

    private String unidadMedida;

    private String categoria;

    private String descripcion;

    private int precio;
}
