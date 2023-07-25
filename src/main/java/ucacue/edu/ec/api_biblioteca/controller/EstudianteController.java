package ucacue.edu.ec.api_biblioteca.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucacue.edu.ec.api_biblioteca.infraestructure.repository.EstudianteRepository;
import ucacue.edu.ec.api_biblioteca.model.Estudiante;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class EstudianteController {

    @Autowired
    EstudianteRepository estudianteRepository;

    @GetMapping("/estudiantes")
    public List<Estudiante> getAllEstudiante(){
        return estudianteRepository.findAll();
    }
}
