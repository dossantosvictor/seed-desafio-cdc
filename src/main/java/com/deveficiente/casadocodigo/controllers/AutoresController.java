package com.deveficiente.casadocodigo.controllers;

import com.deveficiente.casadocodigo.controllers.request.NovoAutorRequest;
import com.deveficiente.casadocodigo.model.Autor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
public class AutoresController {

    @PersistenceContext
    private EntityManager manager;

    @PostMapping(value = "/autores")
    @Transactional
    public String cria(@RequestBody @Valid NovoAutorRequest request ){
        Autor autor = request.toModel();
        return autor.toString();
    }

}
