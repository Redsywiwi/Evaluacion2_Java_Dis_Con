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

import com.Duoc.RecetaYa.demo.Exceptions.DispensacionPerdidaException;
import com.Duoc.RecetaYa.demo.Model.Dispensacion;
import com.Duoc.RecetaYa.demo.Service.DispensacionService;

@RestController
@RequestMapping("/api/dispensacion")
public class DispensacionController {

    @Autowired
    private DispensacionService dispensacionService;

    @GetMapping
    public List<Dispensacion> listar() {
        return dispensacionService.listar();
    }

    @GetMapping("/{id}")
    public Dispensacion buscarporId(@PathVariable String id) {
        return dispensacionService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<Dispensacion> crear(@RequestBody Dispensacion dispensacion) {
        Dispensacion creada = dispensacionService.crear(dispensacion);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{id}")
    public Dispensacion actualizar(@PathVariable String id, @RequestBody Dispensacion dispensacion) {
        return dispensacionService.actualizar(id, dispensacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        dispensacionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(DispensacionPerdidaException.class)
    public ResponseEntity<String> manejarNoEncontrado(DispensacionPerdidaException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
