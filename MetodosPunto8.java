import java.util.Scanner;

public class MetodosPunto8 {
    
    public ObjPunto8[][] llenarMatriz(int d) {
    
        Scanner sc = new Scanner(System.in);

        //Creo matriz
        ObjPunto8[][] m = new ObjPunto8[d][1];


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                //Creo objeto para guardar datos
                ObjPunto8 obj = new ObjPunto8();

                System.out.println("Ingrese el nombre del producto: ");
                obj.setNombre(sc.next());

                System.out.println("Ingrese el peso del producto: ");
                //Validar
                while(!sc.hasNextDouble()) {
                    System.out.println("Dato Erroneo, intentelo de nuevo:");
                    sc.next();
                }
                obj.setPeso(sc.nextDouble());


                System.out.println("Ingrese el precio del producto: ");
                //Validar
                while(!sc.hasNextDouble()) {
                    System.out.println("Dato Erroneo, intentelo de nuevo:");
                    sc.next();
                }
                obj.setPrecio(sc.nextDouble());


                System.out.println("Ingrese la categoria del producto: ");
                System.out.println("A, B o C");
                //Creo una variable para poder validar antes de enviar
                String cat = sc.next().toUpperCase();
                //Validar
                while (!cat.equals("A") && !cat.equals("B") && !cat.equals("C")) {
                    System.out.println("Dato erroneo, digite de nuevo");
                    cat = sc.next();
                }
                System.out.println("-------------");
                obj.setCategoria(cat);

                //Envio datos al registro
                m[i][j] = obj;
            }
        }
         return m;       
    }

    public void mostrarMatriz(ObjPunto8[][] m) {
        System.out.println("PRODUCTO EN TOTAL:\n");
        for (int i = 0; i < m.length; i++) {   
            for (int j = 0; j < m[i].length; j++) {
                
                System.out.println("Producto: " + m[i][j].getNombre());
                System.out.println("Peso: " + m[i][j].getPeso());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Categoria: " + m[i][j].getCategoria());
                System.out.println("-------------");
            }
        }
    }

    public void FiltrarYMostrar(ObjPunto8[][] m) {

        System.out.println("PRODUCTOS FILTRADOS POR CATEGORIA:\n" );
        //Creo vector que almacene categoria, esto me evita hacer 5 contadores y 5 bucles para la separacion de las categorias
        String[] categorias = {"A", "B", "C"};

        //Recorro el vector de categorias
        for(String categoria: categorias){
            int contador = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    //Con el if lo que hago es capturar la categoria y compararla con la que estoy recorriendo y sumar el contador
                    if (m[i][j].getCategoria().equals(categoria)) {
                        contador++;
                    }
                }
            }
            //Creo matriz por cada categoria dentro del bucle categoria
            ObjPunto8[][] filtro = new ObjPunto8[contador][1];
            int indice = 0;

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    //Comparo categoria y si la categoria pertenece a la que estoy recorriendo, el objeto se guarda en la matriz
                    if(m[i][j].getCategoria().equals(categoria)){
                        filtro[indice][0] = m[i][j];
                        indice++;
                    }
                }
            }
            if(contador > 0)
            {   
                System.out.println("Categoria " + categoria + ": ");
                for(int i = 0; i < filtro.length; i++){
                    System.out.println("Producto: " + filtro[i][0].getNombre());
                    System.out.println("Peso: " + filtro[i][0].getPeso());
                    System.out.println("Precio: " + filtro[i][0].getPrecio()); 
                }
                    System.out.println("-------------");
            }
        }
    
    }
}

