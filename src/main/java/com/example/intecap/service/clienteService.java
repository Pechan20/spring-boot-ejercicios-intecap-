package com.example.intecap.Service;


import com.example.intecap.Models.clientes;
import com.example.intecap.common.CommonSvc;

public interface clienteService extends CommonSvc<clientes> {

    public Iterable<clientes> findAll();

    public clientes save(clientes cliente);
}