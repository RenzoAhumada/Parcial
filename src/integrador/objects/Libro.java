
package integrador.objects;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private int cuantityBooks=0;
    Scanner sc = new Scanner(System.in);

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;      
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCuantityBooks() {
        return cuantityBooks;
    }

    public void setCuantityBooks(int cuantityBooks) {
        this.cuantityBooks = cuantityBooks;
    }
    
    public void newBook(){
        try{ 
        System.out.println("Agregue título del libro:");
        titulo = sc.nextLine();
        System.out.println("Agregue año del libro:");
        anio = sc.nextInt(); 
        System.out.println("Agregue autor del libro:");
        autor = sc.next();
        System.out.println("Agregue cantidad de libros que tiene");
        cuantityBooks =sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error en el sistema, no se pudo completar la creacion.");
            titulo=null;
            anio=0;
            autor=null;
            cuantityBooks=0;
        }
    }
    public void viewBooks(){
        System.out.println(titulo);
        System.out.println(anio);
        System.out.println(autor);
        System.out.println(cuantityBooks);
    }
}
