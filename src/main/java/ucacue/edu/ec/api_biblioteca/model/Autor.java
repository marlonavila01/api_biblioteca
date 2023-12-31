package ucacue.edu.ec.api_biblioteca.model;

//esto es un modelo Autor
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;


    @JsonBackReference
    @ManyToMany(mappedBy = "autores")
    private List<Libro> Libros;








}
