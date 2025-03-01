import java.util.Scanner;

public class ProductoPunto1 {

    public String nombre;
    public int precio;
    public int cantidad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    public ProductoPunto1[][] LlenarMatrizProducto(int dimension) {
        Scanner sc = new Scanner(System.in);
        ProductoPunto1[][] productos = new ProductoPunto1[dimension][dimension];
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                System.out.println("Ingrese el nombre del producto");
                ProductoPunto1 producto = new ProductoPunto1();
                producto.setNombre(sc.next());
                producto.setCantidad((int) (Math.random()*50+1));
                producto.setPrecio((int) (Math.random()*100000+1));
                productos[i][j] = producto;
            }
        }

        return productos;
    }
}
