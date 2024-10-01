package com.example.intecap.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.intecap.Models.productos;

public interface productoRepository extends CrudRepository<productos, Long> {

}