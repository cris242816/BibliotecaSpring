package comexamplebibliotecaspring.repository;

import comexamplebibliotecaspring.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}