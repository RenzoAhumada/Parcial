
package integrador.objects;


public class Prestamo {
    public void bookPass(String titulo, Biblioteca biblioteca) {
        Exeptions e = new Exeptions();

        Libro foundBook = biblioteca.buscarLibro(titulo);

        if (foundBook != null) {
            if (foundBook.getCuantityBooks() > 0) {
                foundBook.setCuantityBooks(foundBook.getCuantityBooks() - 1);
                System.out.println("Libro prestado con éxito.");
            } else {
                e.exceptionForPrestamo();
            }
        } else {
            System.out.println("Libro no encontrado en la biblioteca.");
        }
    }
}