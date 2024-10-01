package com.example.tienda.Service.ServiceImpl;

import org.springframework.stereotype.Service;

import com.example.tienda.Models.clientes;
import com.example.tienda.Repository.clientesRepository;
import com.example.tienda.Service.clienteService;
import com.example.tienda.common.CommonSvcImpl;

@Service
public class clientesServiceImpl extends CommonSvcImpl<clientes, clientesRepository> implements clienteService {

    @Override
    public Iterable<clientes> findAll() {
        return repository.findAll();
    }

    @Override
    public clientes save(clientes cliente) {
        System.out.println("Guardando cliente");
        return repository.save(cliente);
    }
    
}