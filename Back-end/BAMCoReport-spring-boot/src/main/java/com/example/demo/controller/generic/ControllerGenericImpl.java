package com.example.demo.controller.generic;

import com.example.demo.service.generic.ServiceGeneric;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




public  class ControllerGenericImpl<T,D> implements ControllerGeneric<T,D> {

    private final ServiceGeneric<T,D> genericService;

    protected ControllerGenericImpl(ServiceGeneric<T,D> genericService) {
        this.genericService = genericService;
    }



    @Override
    @GetMapping(value = {"/", ""})
    @ApiOperation(value = "Get all entities", notes = "Get all entities")
    public ResponseEntity<D> findAll() {
        try {
            return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Error getting all entities", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<D> findById(Long id) {
        try {
            boolean ifExists = genericService.findById(id) != null;
            if (ifExists) {
                return new ResponseEntity(genericService.findById(id), HttpStatus.OK);
            }
            return new ResponseEntity("Entity not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Error getting entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @PostMapping
    public ResponseEntity<Object> save(D entity) {
        try {
            return new ResponseEntity(genericService.save(entity), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Error saving entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(D entity, Long id) {
        try {
            boolean ifExists = genericService.findById(id) != null;
            if (ifExists) {
                return new ResponseEntity(genericService.update(entity), HttpStatus.OK);
            }
            return new ResponseEntity("Entity not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Error updating entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(Long id) {
        try {
            boolean ifExists = genericService.findById(id) != null;
            if (ifExists) {
                genericService.delete(id);
                return new ResponseEntity("Entity deleted", HttpStatus.OK);
            }
            return new ResponseEntity("Entity not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Error deleting entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
