public class Juguetes {
    private String nombre;
    private double precio;
    private Dimension dimension;
  
    public Juguetes(String nombre, double precio, Dimension dimension) {
        this.nombre = nombre;
        this.precio = precio;
        this.dimension = dimension;
    }
    
    public Juguetes() {
    }

    public double calcularPrecioEnvio() {
        double volumen = dimension.calcularVolumen();
        double precioEnvio = 0;

        if(volumen <= 1000){
            precioEnvio = 5;
        } else if (volumen<= 2000){
            precioEnvio = 10;
        } else {
            precioEnvio = 15;
        }
        return precio + precioEnvio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
    @Override
    public String toString() {
        double precioEnvio = calcularPrecioEnvio();
        double volumen = dimension.calcularVolumen();

        return "Juguete:" +
            " nombre: " + nombre + 
            ", precio: " + precio + " euros" +
            ", dimension: " + dimension + 
            ", volumen: " + volumen + ", y su precio incluyendo envio es de: " + precioEnvio + " euros";
    }

}
