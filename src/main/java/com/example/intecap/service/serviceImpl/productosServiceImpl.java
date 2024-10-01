package com.tienda.tienda.Service.ServiceImpl;

import org.springframework.stereotype.Service;

import com.tienda.tienda.Models.productos;
import com.tienda.tienda.Repository.productoRepository;
import com.tienda.tienda.Service.productoService;
import com.tienda.tienda.common.CommonSvcImpl;

@Service
public class productosServiceImpl extends CommonSvcImpl<productos, productoRepository> implements productoService {

    @Override
    public Iterable<productos> findAll() {
        return repository.findAll();
    }

    @Override
    public productos save(productos producto) {
        System.out.println("Guardando producto");
        return repository.save(producto);
    }
}