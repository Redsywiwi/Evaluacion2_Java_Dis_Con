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

import com.Duoc.RecetaYa.demo.Exceptions.UsuariosPerdidosException;
import com.Duoc.RecetaYa.demo.Model.Usuarios;
import com.Duoc.RecetaYa.demo.Service.UsuariosService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public List<Usuarios> listar() {
        return usuariosService.listar();
    }

    @GetMapping("/{id}")
    public Usuarios buscarporId(@PathVariable Long id) {
        return usuariosService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<Usuarios> crear(@RequestBody Usuarios usuarios) {
        Usuarios creada = usuariosService.crear(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{id}")
    public Usuarios actualizar(@PathVariable Long id, @RequestBody Usuarios usuarios) {
        return usuariosService.actualizar(id, usuarios);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        usuariosService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(UsuariosPerdidosException.class)
    public ResponseEntity<String> manejarNoEncontrado(UsuariosPerdidosException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
