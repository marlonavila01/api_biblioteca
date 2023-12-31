package ucacue.edu.ec.api_biblioteca.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Libro")

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String autor;
    private String genero;
    private String editorial;
    private String descripcion;


@ManyToMany
@JoinTable(
        name = "Libro_autor",
        joinColumns = @JoinColumn(name = "Libro_id"),
        inverseJoinColumns = @JoinColumn(name = "autor_id")
)
    private List<Autor> autores;

}
