package cl.duoc.biblioteca.services;

import java.util.List;

import cl.duoc.biblioteca.model.Libro;
import cl.duoc.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    
    public List<Libro> getLibros(){
        return libroRepository.findAll();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.save(libro);
    }

    public Libro getLibro(int id){
        return libroRepository.findById(id).orElse(null);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.save(libro);
    }
 
    public String deleteLibro (int id){
        libroRepository.deleteById(id);
        return "producto eliminado";
    }

    public int totalLibrosV1(){
        return (int) libroRepository.count();
    }

    public int totalLibrosV2(){
        return libroRepository.totalLibros();

    }
}
