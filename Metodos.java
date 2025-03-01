import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public Objetos[][] LlenarMatrizObjetos(int d) {
        Objetos[][] matriz = new Objetos[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Objetos obj = new Objetos();// Crear un objeto "obj" de la clase Objetos
                System.out.println("Ingrese el nombre del repuesto de moto: ");
                obj.setNombre(sc.next());// Asignar el nombre del producto al objeto obj
                System.out.println("Ingrese la descripción del repuesto de moto: ");
                obj.setDescripcion(sc.next());
                System.out.println("Ingrese el precio del repuesto de moto: ");// Asignar el precio del producto al
                                                                               // objeto obj
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la disponibilidad del repuesto de moto 1 'SI' 0 'NO': ");
                int dis = 0;
                dis = sc.nextInt();
                if (dis == 1) // Si el usuario ingresa 1, se asigna true a la disponibilidad
                    obj.setDisponibilidad(true);
                else if (dis == 0)// Si el usuario ingresa 0, se asigna false a la disponibilidad
                    obj.setDisponibilidad(false);
                else
                    System.out.println("Opcion no válida");
                matriz[i][j] = obj;
            }
        }
        return matriz;
    }

    // Método para mostrar la matriz de objetos
    public void MostrarMatrizObjetos(Objetos[][] matriz) {
        System.out.println("MOSTRADO DE REPUESTOS DE MOTO DISPONIBLES");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) { // Si la matriz en la posición i,j es diferente de null, se muestra la
                                            // información
                    System.out.println("Nombre: " + matriz[i][j].getNombre());
                    System.out.println("Descripción: " + matriz[i][j].getDescripcion());
                    System.out.println("Precio: " + matriz[i][j].getPrecio());
                    System.out.println("Disponibilidad: " + matriz[i][j].isDisponibilidad());
                    System.out.println();
                }
            }
        }
    }

    // Método para obtener los productos disponibles
    public Objetos[][] ProductosDisponibles(Objetos[][] matriz) {
        Objetos[][] matrizDisponibles = new Objetos[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && matriz[i][j].isDisponibilidad()) {// Verificar que el objeto no sea nulo y
                                                                              // que esté disponible
                    matrizDisponibles[i][j] = matriz[i][j];// Asignar el objeto a la matriz de productos disponibles
                }
            }
        }
        return matrizDisponibles;
    }

}

