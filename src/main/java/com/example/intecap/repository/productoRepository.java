package com.example.intecap.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.intecap.models.productosModel;

public interface productoRepository extends CrudRepository<productosModel, Object> {

    // funcion para buscar por nombre
    public productosModel findByNombre(String nombre);
}