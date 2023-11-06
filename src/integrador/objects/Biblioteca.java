
package integrador.objects;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Biblioteca {
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Libro> libros = new ArrayList();

    public Biblioteca() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public List<Libro> getLibros() {
        return libros;
    }

    public void newBook() {
    try {
        Libro book = new Libro();
        book.newBook();
        libros.add(book);
    } catch (InputMismatchException e) {
        System.out.println("Error en el sistema, no se pudo completar la creación.");
    }
}

    public void newUser() {
        try {
            Usuario user = new Usuario();
            user.NewUser();  
            usuarios.add(user);
        } catch (InputMismatchException e) {
            System.out.println("Error al crear el usuario.");
        }
    }

    public void viewUsers() {
        System.out.println("Lista de Usuarios:");
        for (Usuario user : usuarios) {
            user.viewUser();
        }
    }

    public void viewBooks() {
        System.out.println("Lista de Libros:");
        for (Libro libro : libros) {
            libro.viewBooks();
        }
    }
 public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;    }
}
