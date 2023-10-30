
package integrador.objects;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private List <Usuario> usuarios = new ArrayList<>();
   private List <Libro> libros = new ArrayList<>();

    public Biblioteca() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void viewBooks(){
        
        System.out.println("Ingrese el titulo del libro a buscar");
        
    }
    
    public void viewUser(int userRegister){  
        for (int i = 0; i < userRegister; i++){
        usuarios.get(i);   
    }
}
}
