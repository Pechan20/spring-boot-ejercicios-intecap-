package com.example.intecap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intecap.models.clientesModel;
import com.example.intecap.service.clienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
public class clientesController  {

    @Autowired
    private clienteService ClientesService;

    @GetMapping("/")
    public Iterable<clientesModel> getClientes() {
        return this.ClientesService.findAll();
    }
    // para poder consumir este apartado necesito colocar ("/clientes")
    @PostMapping("/save")
    public ResponseEntity<String> saveClientes(@RequestBody clientesModel cliente) {
        try {
            System.out.println(cliente.getNombre() + " " + cliente.getApellido());
            this.ClientesService.save(cliente);
            return ResponseEntity.ok("Cliente guardado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar el cliente" + e.getMessage());
        }

    }

}