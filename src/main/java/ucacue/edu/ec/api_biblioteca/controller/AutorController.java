package ucacue.edu.ec.api_biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ucacue.edu.ec.api_biblioteca.infraestructura.repositorio.AutorRepositorio;
import ucacue.edu.ec.api_biblioteca.model.Autor;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class AutorController {

    @Autowired
    AutorRepositorio autorRepositorio;

    @GetMapping("/autores")
    @ResponseStatus(HttpStatus.OK)
    public List<Autor> getAutores() {
        return autorRepositorio.findAll();
    }

}
