package com.israft.prueba1ift;

import com.israft.prueba1ift.model.Perro;

import java.util.List;
import java.util.Optional;

public interface PerroService {
    List<Perro> findAll();
    Optional<Perro> findById(Long id);
    void savePerro(Perro perro);
    Perro updatePerro(Long id, Perro perro);
    void deletePerroById(Long id);
}
