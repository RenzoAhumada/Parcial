
package integrador.objects;

import java.util.Scanner;


public class Prestamo extends Libro {
    private boolean pass=true;

    public Prestamo() {
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public void bookPass(){
        Libro book = new Libro();
        Exeptions e = new Exeptions();
        if(book.getCuantityBooks()==0){
            e.exceptionForPrestamo();
        }else{
            book.setCuantityBooks(book.getCuantityBooks()-1);           
        }
}
}
