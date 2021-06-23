package com.matricula.api.service;

import com.matricula.api.model.Alumno;
import com.matricula.api.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AlumnoService {

    @Autowired
    private AlumnoRepository repository;

    public List<Alumno> getAll(){
        return repository.findAll();
    }

    public List<Alumno> findByNombreOrApellido(String n, String a){
        return repository.findByNombreContainsOrApellidoContains(n, a);
    }

    public String create(Alumno alumno){
        repository.save(alumno);
        return "Alumno \""+alumno.getNombre()+"\" creado.";
    }

}
