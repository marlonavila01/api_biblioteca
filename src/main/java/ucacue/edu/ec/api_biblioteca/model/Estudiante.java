package ucacue.edu.ec.api_biblioteca.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("estudiante")
public class Estudiante extends Persona {

    private String carrera;
}
