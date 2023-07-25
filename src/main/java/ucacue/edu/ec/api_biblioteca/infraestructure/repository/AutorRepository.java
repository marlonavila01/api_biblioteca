package ucacue.edu.ec.api_biblioteca.infraestructure.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ucacue.edu.ec.api_biblioteca.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
