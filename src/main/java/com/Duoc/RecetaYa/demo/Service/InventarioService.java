package com.Duoc.RecetaYa.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Duoc.RecetaYa.demo.Model.Inventario;
import com.Duoc.RecetaYa.demo.Repository.InventarioRepository;
import com.Duoc.RecetaYa.demo.Exceptions.InventarioPerdidoException;

@Service 
public class InventarioService {
    
    @Autowired 
    private InventarioRepository inventariorepository;

    public List<Inventario> listar() {
        return inventariorepository.findAll();
    }

    public Inventario buscarPorId(String id) {
        return inventariorepository.findById(id)
            .orElseThrow(() -> new InventarioPerdidoException("Inventario no encontrado"));
    }

    public Inventario crear(Inventario inventario){
        return inventariorepository.save(inventario);
    }

    public Inventario actualizar(String id, Inventario coso){
        Inventario invnuevo = buscarPorId(id);
        invnuevo.setNombre(coso.getNombre());
        invnuevo.setCantidad(coso.getCantidad());
        invnuevo.setFechaVencimiento(coso.getFechaVencimiento());
        invnuevo.setUnidadMedida(coso.getUnidadMedida());
        invnuevo.setCategoria(coso.getCategoria());
        invnuevo.setDescripcion(coso.getDescripcion());
        invnuevo.setPrecio(coso.getPrecio());

        return inventariorepository.save(invnuevo);
    }

    public void eliminar(String id) {
        Inventario eliminarinv= buscarPorId(id);
        inventariorepository.delete(eliminarinv);
    }
}
