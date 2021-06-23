package com.matricula.api.controller;


import com.matricula.api.model.Grado;
import com.matricula.api.service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/grados")
public class GradoController {

    @Autowired
    private GradoService service;

    @GetMapping
    public ResponseEntity<?> allAbilities(){
        List<Grado> list = service.getAll();
        if (list.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay Grados.");
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PostMapping
    public ResponseEntity<?> createAbility(@RequestBody Grado grado){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(grado));
    }
}
