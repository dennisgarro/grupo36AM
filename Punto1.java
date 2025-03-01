public class Punto1 {

    public void PrecioMasElevado (ProductoPunto1[][] productos){
       ProductoPunto1 productoPrecioMasElevado = new ProductoPunto1();
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (i+1 == productos.length || j+1 == productos[i].length) {
                    
                }else if (productos[i][j].precio > productos[i+1][j+1].precio) {
                    productoPrecioMasElevado = productos[i][j];
                }else{
                    productoPrecioMasElevado = productos[i+1][j+1];
                }
            }
        }
        System.out.println("El producto con precio mas elevado es: "+ productoPrecioMasElevado.getNombre()+
        " Con un precio de: "+ productoPrecioMasElevado.getPrecio() + " y una cantidad de: "+ productoPrecioMasElevado.getCantidad());
    }
    
}