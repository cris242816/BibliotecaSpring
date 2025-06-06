package comexamplebibliotecaspring.service.impl;

import comexamplebibliotecaspring.entity.Libro;
import comexamplebibliotecaspring.repository.LibroRepository;
import comexamplebibliotecaspring.service.LibroService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {

    private final LibroRepository libroRepository;

    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> getLibroById(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    public List<Libro> buscarPorTitulo(String titulo) {
        return libroRepository.findByTituloContainingIgnoreCase(titulo);
    }

    @Override
    public List<Libro> buscarPorAutor(String autor) {
        return libroRepository.findByAutorContainingIgnoreCase(autor);
    }

    @Override
    public List<Libro> buscarPorGenero(String genero) {
        return libroRepository.findByGeneroContainingIgnoreCase(genero);
    }

    @Override
    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
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