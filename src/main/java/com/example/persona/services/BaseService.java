package com.example.persona.services;

import com.example.persona.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> findAll() throws Exception; // Trae una lista de todas las persona registradas en la BD
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById(ID id) throws Exception; // Trae una entidad segun si ID
    public E save(E entity) throws Exception;// Crea una nueva entidad
    public E update(ID id, E entity) throws Exception; // Actualiza la entidad
    public boolean delete(ID id) throws Exception; // Elimina algun registro de la BD

}
