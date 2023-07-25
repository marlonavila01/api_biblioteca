package ucacue.edu.ec.api_biblioteca.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
}
