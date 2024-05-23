public class Circulos extends FigurasGeometricas{
    Double radio;

    public Circulos() {
    }

    public Circulos(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
