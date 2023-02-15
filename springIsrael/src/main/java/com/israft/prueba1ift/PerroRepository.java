package com.israft.prueba1ift;

import com.israft.prueba1ift.model.Perro;
import org.springframework.data.repository.CrudRepository;

public interface PerroRepository extends CrudRepository<Perro, Long> {
}
