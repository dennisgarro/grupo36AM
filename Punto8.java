
import java.util.Scanner;

public class Punto8 {

    public void punto8() {

        Scanner sc = new Scanner(System.in);
        MetodosPunto8 m = new MetodosPunto8();

        System.out.println("Ingrese la cantidad de productos a registrar: ");
        while (!sc.hasNextInt()) {
            System.out.println("Dato Erroneo, intentelo de nuevo:");
            sc.next();
        }
        int d = sc.nextInt();

        ObjPunto8[][] M = m.llenarMatriz(d);
        m.mostrarMatriz(M);
        m.FiltrarYMostrar(M);
    }
}
