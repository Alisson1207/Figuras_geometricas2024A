public class nonagono {
    int medidalado;
    double apotema;

    public nonagono() {
    }
    public nonagono(double apotema) {
        this.apotema = apotema;
    }

    public nonagono(int medidalado) {
        this.medidalado = medidalado;
    }

    public int getLado() {
        return medidalado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setLado(int medidalado) {
        this.medidalado = medidalado;
    }
    public double calcularPerimetro() {
        return medidalado * 9;
    }
    public double calcularArea() {
        return (9*apotema*medidalado)/2;
    }
}
