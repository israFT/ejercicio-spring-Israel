package com.israft.prueba1ift;

import com.israft.prueba1ift.model.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerroServiceImp implements PerroService {
    @Autowired
    private PerroRepository pr;
    public List<Perro> findAll() {
        return (List<Perro>) pr.findAll();
    }

    public Optional<Perro> findById(Long id) {
        return pr.findById(id);
    }

    public void savePerro(Perro perro) {
        pr.save(perro);
    }

    public Perro updatePerro(Long id, Perro perro) {
        if (pr.findById(id).isPresent()){
            pr.save(perro);
        }
        return perro;
    }

    public void deletePerroById(Long id) {
        pr.deleteById(id);
    }
}
