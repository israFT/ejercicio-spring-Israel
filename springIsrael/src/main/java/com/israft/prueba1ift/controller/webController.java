package com.israft.prueba1ift.controller;

import com.israft.prueba1ift.PerroServiceImp;
import com.israft.prueba1ift.model.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class webController {
    @Autowired
    private PerroServiceImp psi;

    //the CRUD:
    // C
    @PostMapping("/crea")
    public void creaPerro(Perro p){
        psi.savePerro(p);
    }

    // R
    @GetMapping("/perros")
    public List<Perro> listaPerros(){
        return psi.findAll();
    }

    // U
    @PutMapping("/perros/{id}")
    public Perro actualizaPerro(@PathVariable Long id, Perro perro){
       return psi.updatePerro(id,perro);
    }
    // D
    @DeleteMapping("/perros/{id}")
    public void borraPerro(@PathVariable Long id){
        psi.deletePerroById(id);
    }
}
