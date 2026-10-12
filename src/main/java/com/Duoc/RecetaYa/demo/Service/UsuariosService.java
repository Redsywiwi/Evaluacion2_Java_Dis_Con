package com.Duoc.RecetaYa.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Duoc.RecetaYa.demo.Model.Usuarios;
import com.Duoc.RecetaYa.demo.Repository.UsuariosRepository;
import com.Duoc.RecetaYa.demo.Exceptions.UsuariosPerdidosException;

@Service 
public class UsuariosService {
    
    @Autowired 
    private UsuariosRepository usuariosRepository;

    public List<Usuarios> listar() {
        return usuariosRepository.findAll();
    }

    public Usuarios buscarPorId(Long id) {
        return usuariosRepository.findById(id)
            .orElseThrow(() -> new UsuariosPerdidosException("Receto no encontrado"));
    }

    public Usuarios crear(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    public Usuarios actualizar(Long id, Usuarios coso){
        Usuarios usunuevo = buscarPorId(id);
        usunuevo.setNombre(coso.getNombre());
        usunuevo.setAppaterno(coso.getAppaterno());
        usunuevo.setApmaterno(coso.getApmaterno());
        usunuevo.setRut(coso.getRut());
        usunuevo.setCorreo(coso.getCorreo());
        usunuevo.setNumerotelefonico(coso.getNumerotelefonico());
        usunuevo.setDireccion(coso.getDireccion());


        return usuariosRepository.save(usunuevo);
    }

    public void eliminar(Long id) {
        Usuarios eliminarusuario= buscarPorId(id);
        usuariosRepository.delete(eliminarusuario);
    }
}
