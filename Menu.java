import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opt = 0, d = 0;
            boolean bandera = true;
            while (bandera) {
                System.out.println("Ingrese el punto que desea validar");
                while (!sc.hasNextInt()) {
                    System.out.println("por favor ingrese un dato numerico");
                    sc.next();
                }
                opt = sc.nextInt();
                System.out.println("ingrese la dimension de la matriz");
                while (!sc.hasNextInt()) {
                    System.out.println("la dimension de la matriz debe ser numerica");
                    d = sc.nextInt();
                }
                d = sc.nextInt();
                switch (opt) {
                    case 1:
                     //Punto 1 Realizado por Sergio Andres Aguirre Grisales
                       Punto1 punto1 = new Punto1();
                       ProductoPunto1 pp1 = new ProductoPunto1();
                       ProductoPunto1[][] productos =  pp1.LlenarMatrizProducto(d);
                       punto1.PrecioMasElevado(productos);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:

                        break;
                    case 6:
                        // Punto 6 Realizado por Cristian Camilo Gonzalez Carmona
                        Metodos me = new Metodos();
                        Objetos[][] matriz = me.LlenarMatrizObjetos(d);
                        // me.MostrarMatrizObjetos(matriz);
                        Objetos[][] matrizDisponibles = me.ProductosDisponibles(matriz);
                        me.MostrarMatrizObjetos(matrizDisponibles);
                        break;
                    case 7:
                        break;
                    case 8:
                        Punto8 p8 = new Punto8();
                        p8.punto8();
                        break;
                    case 9:
                        break;
                    case 10:
                        break;

                    default:
                        break;
                }
            }
        }

    }
}