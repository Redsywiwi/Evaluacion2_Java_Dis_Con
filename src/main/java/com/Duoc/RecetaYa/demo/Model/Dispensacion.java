package com.Duoc.RecetaYa.demo.Model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dispensacion")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Dispensacion{
    @Id 
    private String id;

    private String productodispensado;

    private LocalDateTime fechadispensacion;

    private int cantidad;

    private int preiofinal;
}