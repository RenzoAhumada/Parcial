
package integrador.objects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usuario {
    private String nombre;
    private int dni;
    private int identificacion = 0;
    private static int contadorUsuarios = 0;
    Scanner sc = new Scanner(System.in);

    public Usuario() {
        contadorUsuarios++;
        identificacion = contadorUsuarios;
    }

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        contadorUsuarios++;
        identificacion = contadorUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void NewUser() {
        try{
        System.out.println("Ingrese nombre de usuario: ");
        nombre = sc.next();
        System.out.println("Ingrese DNI");
        dni = sc.nextInt();
        identificacion = (int)(Math.random()*1000 + 1);
        contadorUsuarios = contadorUsuarios ++;
    }catch(InputMismatchException e){
            System.out.println("Error al crear el usario");
            nombre = null;
            dni = 0;
            identificacion = 0;
            contadorUsuarios = contadorUsuarios--;
    }
}
    public void viewUser(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(identificacion);
    }
}

