public class Decagono {
    int medidalado;
    double apotema;

    public Decagono() {
    }
|
    public Decagono(int medidalado, double apotema) {
        this.medidalado = medidalado;
        this.apotema = apotema;
    }

    public int getMedidalado() {
        return medidalado;
    }

    public void setMedidalado(int medidalado) {
        this.medidalado = medidalado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public double calcularPerimetro(){
        return 10*medidalado;
    }
    public double calcularArea(){
        return(5*medidalado*apotema);
    }
}
