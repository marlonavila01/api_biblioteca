package ucacue.edu.ec.api_biblioteca.infraestructure.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucacue.edu.ec.api_biblioteca.model.Estudiante;

//Esto es un repositorio
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
