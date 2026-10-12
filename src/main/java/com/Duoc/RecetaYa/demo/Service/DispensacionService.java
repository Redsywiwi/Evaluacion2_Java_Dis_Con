package com.Duoc.RecetaYa.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Duoc.RecetaYa.demo.Exceptions.Excepciones;
import com.Duoc.RecetaYa.demo.Model.Dispensacion;
import com.Duoc.RecetaYa.demo.Repository.DispensacionRepository;

@Service 
public class DispensacionService {
    
    @Autowired 
    private DispensacionRepository dispensacionrepository;

    public List<Dispensacion> listar() {
        return dispensacionrepository.findAll();
    }

    public Dispensacion buscarPorId(Long id) {
        return dispensacionrepository.findById(id)
            .orElseThrow(() -> new DispensacionPerdidaException("Dispensacion no encontrada"));
    }

    public Dispensacion crear(Dispensacion dispensacion){
        return dispensacionrepository.save(dispensacion);
    }

    public Dispensacion actualizar(Long id, Dispensacion coso){
        Dispensacion disnueva = buscarPorId(id);
        disnueva.setProductodispensado(coso.getProductodispensado());
        disnueva.setFechadispensacion(coso.getFechadispensacion());
        disnueva.setCantidad(coso.getCantidad());

        return dispensacionrepository.save(disnueva);
    }

    public void eliminar(Long id) {
        Dispensacion eliminardis= buscarPorId(id);
        dispensacionrepository.delete(eliminardis);
    }
}
