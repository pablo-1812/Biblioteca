package cl.duoc.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.duoc.biblioteca.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    //arreglo que guardara todos los libros
   default int totalLibros() {
        return (int) this.count(); // ← "this" se refiere a la instancia del repository
    }
}  
