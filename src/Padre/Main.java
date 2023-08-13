package Padre;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Padre.Empleado;
import Hijo.ScrumMaster;

public class Main {

    public static void imprime(Empleado emp){
        System.out.println("Objeto.ObtenerDetalles()=" + emp.obtenerDetalles());
    }

    public static void prueba(int dato){
        System.out.println("Nada");
    }

    public static void determinarTipo(Empleado emp){
        if (emp instanceof ScrumMaster){
            System.out.println("Esto viene de ScrumMaster" + emp.obtenerDetalles());
        } else if (emp instanceof Empleado){
            System.out.println("Esto viene del padre" + emp.obtenerDetalles());
        } else if (emp instanceof Object){
            System.out.println("Esto viene de Object"+ emp.obtenerDetalles());
        }
    }

    public static void main(String[] args) {

        Empleado em = new Empleado("Chapulin", 3500);
      imprime (em);
        ScrumMaster sm = new ScrumMaster("Juan", 3500, "Informatica");



        System.out.println(sm.obtenerDetalles());

    }
}