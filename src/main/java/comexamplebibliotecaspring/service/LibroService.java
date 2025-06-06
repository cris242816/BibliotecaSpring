package comexamplebibliotecaspring.service;

import comexamplebibliotecaspring.entity.Libro;
import java.util.List;
import java.util.Optional;

public interface LibroService {
    List<Libro> getAllLibros();
    Optional<Libro> getLibroById(Long id);
    List<Libro> buscarPorTitulo(String titulo);
    List<Libro> buscarPorAutor(String autor);
    List<Libro> buscarPorGenero(String genero);
    Libro saveLibro(Libro libro);
    Libro updateLibro(Long id, Libro libro);
    void deleteLibro(Long id);
}