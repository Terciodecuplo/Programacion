public abstract class ProductoElectronico {
    private String nombreProducto;
    private double precio;
    private String marca;

    public ProductoElectronico(String nombreProducto, double precio, String marca){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
}
