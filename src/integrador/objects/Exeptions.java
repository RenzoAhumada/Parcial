
package integrador.objects;

import integrador.InicioPrograma;

public class Exeptions extends Exception{
    public void exceptionForPrestamo(){
        InicioPrograma inicio = new InicioPrograma();
        System.out.println("No se puede prestar el libro ya que no hay");
        inicio.iniciar();
}
}
