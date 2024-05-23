//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas miFiigura = new FigurasGeometricas(); //Creacion objeto de la clase padre

        //Constructores con valores nulos
        Circulos mifigura2 = new Circulos();
        Triangulos mifigura3 = new Triangulos();
        Cuadrilateros mifigura4 = new Cuadrilateros();

        //Creacion con valore quemados
        Circulos mifigura5 = new Circulos(3.00);
        Triangulos mifigura6 = new Triangulos(6.00,8.00);
        Cuadrilateros mifigura7 = new Cuadrilateros(5.00,5.00);
        Cuadrilateros mifigura8 = new Cuadrilateros(5.00,10.00);

        //Metodos
        mifigura2.setNombre("Pileta del CEC");
        System.out.println(mifigura2.getNombre() );

        System.out.println("La nueva pileta del CEC tendrá un radio de: ");
        mifigura2.setRadio(4.00);
        System.out.println(mifigura2.getRadio() );

        System.out.println("Y su área será: ");
        System.out.println(mifigura2.calcularArea());

        mifigura3.setBase(2.00);
        mifigura3.setAltura(5.0);
        System.out.println("El área del triangulo es: ");
        System.out.println(mifigura3.calcularArea());

        mifigura4.setLargo(5.00);
        mifigura4.setAncho(7.00);
        System.out.println("El área del cuadrilatero es: ");
        System.out.println(mifigura4.calcularArea());

        //Calculos con valores quemados
        System.out.println("El área del ciculo es: ");
        System.out.println(mifigura5.calcularArea());

        System.out.println("El área del triangulo es: ");
        System.out.println(mifigura6.calcularArea());

        System.out.println("El área del cuadrilatero es: ");
        System.out.println(mifigura7.calcularArea());

        System.out.println("El área del cuadrilatero es: ");
        System.out.println(mifigura8.calcularArea());

    }
}