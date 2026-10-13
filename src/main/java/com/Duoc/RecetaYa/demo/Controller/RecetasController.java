package com.Duoc.RecetaYa.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Duoc.RecetaYa.demo.Exceptions.RecetaPerdidaException;
import com.Duoc.RecetaYa.demo.Model.Recetas;
import com.Duoc.RecetaYa.demo.Service.RecetasService;

@RestController
@RequestMapping("/api/recetas")
public class RecetasController{

    @Autowired
    private RecetasService recetasService;

    @GetMapping
    public List<Recetas> listar() {
        return recetasService.listar();
    }

    @GetMapping("/{id}")
    public Recetas buscarporId(@PathVariable String id) {
        return recetasService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<Recetas> crear(@RequestBody Recetas recetas) {
        Recetas creada = recetasService.crear(recetas);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{id}")
    public Recetas actualizar(@PathVariable String id, @RequestBody Recetas recetas) {
        return recetasService.actualizar(id, recetas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        recetasService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(RecetaPerdidaException.class)
    public ResponseEntity<String> manejarNoEncontrado(RecetaPerdidaException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
