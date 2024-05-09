public class Dimension {
    private double ancho;
    private double alto;
    private double profundidad;


    public Dimension(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public double calcularVolumen() {
        return ancho * alto * profundidad; 

    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getProfundidad() {
        return this.profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "sus medidas son: " +
            " ancho: " + getAncho() + 
            ", alto: " + getAlto() + "'" +
            ", profundidad: " + getProfundidad();
    }

    
}
