package com.example.demo.service.generic;

import java.util.List;

public interface ServiceGeneric<T,D> {

    List<D> findAll() throws Exception;
    D findById(Long id) throws Exception;
    D save(D entity) throws Exception;
    D update(D entity) throws Exception;
    void delete(Long id) throws Exception;
}
