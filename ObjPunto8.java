public class ObjPunto8 {

    private String nombre;
    private double peso;
    private double precio;
    private String categoria;

    public ObjPunto8(String nombre, double peso, double precio, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.categoria = categoria;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ObjPunto8() {
    }

}