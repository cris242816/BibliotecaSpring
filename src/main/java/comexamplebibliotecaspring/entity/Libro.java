package comexamplebibliotecaspring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "libros")
@Data
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String genero;
    private int añoPublicacion;
    private boolean disponible;
}