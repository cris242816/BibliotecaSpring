package comexamplebibliotecaspring.service.impl;

import comexamplebibliotecaspring.entity.Libro;
import comexamplebibliotecaspring.repository.LibroRepository;
import comexamplebibliotecaspring.service.LibroService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements LibroService {

    private final UsuarioRepository UsuarioRepository;

    public UsuarioServiceimpl(LibroRepository libroRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }

    @Override
    public List<Libro> getAllLibros() {
        return UsuarioRepository.findAll();
    }

    @Override
    public Optional<Libro> getLibroById(Long id) {
        return UsuarioRepository.findById(id);
    }

    @Override
    public List<Libro> buscarPorTitulo(String titulo) {
        return UsuarioRepository.findByTituloContainingIgnoreCase(titulo);
    }

    @Override
    public List<Libro> buscarPorAutor(String autor) {
        return UsuarioRepository.findByAutorContainingIgnoreCase(autor);
    }

    @Override
    public List<Libro> buscarPorGenero(String genero) {
        return UsuarioRepository.findByGeneroContainingIgnoreCase(genero);
    }

    @Override
    public Libro saveLibro(Libro libro) {
        return UsuarioRepository.save(libro);
    }

    @Override
    public Libro updateLibro(Long id, Libro libro) {
        libro.setId(id);
        return libroRepository.save(libro);
    }

    @Override
    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }
}