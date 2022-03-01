package com.example.demo.controller.generic;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public interface ControllerGeneric<T,D> {


    ResponseEntity<D> findAll();

    ResponseEntity<D> findById(@PathVariable Long id);

    ResponseEntity<Object> save(@RequestBody D entity);

    ResponseEntity<Object> update(@RequestBody D entity, @PathVariable Long id);

    ResponseEntity<String> delete(@PathVariable Long id);


}
