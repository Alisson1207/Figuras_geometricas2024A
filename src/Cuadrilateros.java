public class Cuadrilateros extends FigurasGeometricas {
    Double largo,ancho;
    public Cuadrilateros() {

    }

    public Cuadrilateros(Double largo, Double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    public double calcularArea() {
        return largo * ancho;
    }
}
