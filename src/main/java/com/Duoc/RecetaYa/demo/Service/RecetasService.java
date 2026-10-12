package com.Duoc.RecetaYa.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Duoc.RecetaYa.demo.Model.Recetas;
import com.Duoc.RecetaYa.demo.Repository.RecetasRepository;
import com.Duoc.RecetaYa.demo.Exceptions.RecetaPerdidaException;

@Service 
public class RecetasService {
    
    @Autowired 
    private RecetasRepository recetasRepository;

    public List<Recetas> listar() {
        return recetasRepository.findAll();
    }

    public Recetas buscarPorId(Long id) {
        return recetasRepository.findById(id)
            .orElseThrow(() -> new RecetaPerdidaException("Receta no encontrada"));
    }

    public Recetas crear(Recetas recetas){
        return recetasRepository.save(recetas);
    }

    public Recetas actualizar(Long id, Recetas coso){
        Recetas recnueva = buscarPorId(id);
        recnueva.setNombre(coso.getNombre());
        recnueva.setDescripcion(coso.getDescripcion());
        recnueva.setTotal((coso.getTotal()));

        return recetasRepository.save(recnueva);
    }

    public void eliminar(Long id) {
        Recetas eliminarrec= buscarPorId(id);
        recetasRepository.delete(eliminarrec);
    }
}
