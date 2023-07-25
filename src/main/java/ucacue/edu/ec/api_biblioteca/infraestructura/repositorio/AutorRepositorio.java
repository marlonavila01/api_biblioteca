package ucacue.edu.ec.api_biblioteca.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import ucacue.edu.ec.api_biblioteca.model.Autor;

public interface AutorRepositorio extends JpaRepository<Autor, Integer>{

}
