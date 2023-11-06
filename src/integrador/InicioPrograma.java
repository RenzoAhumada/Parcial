/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import integrador.objects.Biblioteca;
import integrador.objects.Libro;
import integrador.objects.Prestamo;
import integrador.objects.Usuario;
import java.util.Scanner;

public class InicioPrograma {
    public void iniciar() {
        Usuario user = new Usuario();
        Libro book = new Libro();
        Biblioteca library = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        Prestamo prestamos = new Prestamo();
        String libro;
        int options;
        
        do {
            System.out.println("Opcion 1: Crear un nuevo libro");
            System.out.println("Opcion 2: Crear un nuevo usuario");
            System.out.println("Opcion 3: Ver la lista de los libros");
            System.out.println("Opcion 4: Prestar un libro");
            System.out.println("Opcion 5: Salir");
            System.out.print("Seleccione una opción: ");

            try {
                options = sc.nextInt();
                sc.nextLine();  // Consumir el salto de línea pendiente

                switch (options) {
                    case 1:
                        System.out.println("Crear un libro");
                        library.newBook();
                        break;
                    case 2:
                        System.out.println("Crear un usuario nuevo");
                        user.NewUser();
                        library.newUser();
                        break;
                    case 3:
                        System.out.println("Lista de libros:");
                        library.viewBooks();
                        break;
                    case 4:
                        System.out.println("Prestar un libro");
                        System.out.println("Introduce el título del libro que deseas prestar:");
                        libro = sc.nextLine();
                        prestamos.bookPass(libro, library);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error en la entrada. Asegúrate de ingresar un número válido.");
                sc.nextLine();
                options = 0;
            }
        } while (options != 5);
    }
}