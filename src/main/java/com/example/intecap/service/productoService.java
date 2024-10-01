package com.example.intecap.Service;

import com.example.intecap.Models.productos;
import com.example.intecap.common.CommonSvc;

public interface productoService extends CommonSvc<productos> {

    public Iterable<productos> findAll();

    public productos save(productos producto);
}