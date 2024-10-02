package com.example.intecap.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.intecap.models.clientesModel;
import com.example.intecap.repository.clientesRepository;
import com.example.intecap.service.clienteService;
import com.example.intecap.common.CommonSvcImpl;

@Service
public class clientesServiceImpl extends CommonSvcImpl<clientesModel, clientesRepository> implements clienteService {

    @Override
    public Iterable<clientesModel> findAll() {
        return repository.findAll();
    }

    @Override
    public clientesModel save(clientesModel cliente) {
        System.out.println("Guardando cliente");
        return repository.save(cliente);
    }
    
}