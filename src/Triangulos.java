public class Triangulos extends FigurasGeometricas{
    Double base, altura;

    public Triangulos() {
    }

    public Triangulos(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return base*altura;
    }
}
