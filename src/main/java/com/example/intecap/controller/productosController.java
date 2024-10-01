package com.example.intecap.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intecap.Models.productos;
import com.example.intecap.Service.productoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/productos")
public class productosController  {

    @Autowired
    private productoService ProductosService;

    @GetMapping("/")
    public Iterable<productos> getProductos() {
        return this.ProductosService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveProductos(@RequestBody productos producto) {
        try {
            System.out.println(producto.getNombre() + " " + producto.getDescripcion());
            this.ProductosService.save(producto);
            return ResponseEntity.ok("Producto guardado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar el producto: " + e.getMessage());
        }

    }

}