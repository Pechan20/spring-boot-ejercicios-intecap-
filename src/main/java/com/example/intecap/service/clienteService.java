package com.example.intecap.service;


import com.example.intecap.models.clientesModel;
import com.example.intecap.common.CommonSvc;

public interface clienteService extends CommonSvc<clientesModel> {

    public Iterable<clientesModel> findAll();

    public clientesModel save(clientesModel cliente);
}