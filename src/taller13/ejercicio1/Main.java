package taller13.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5.0, 3.0);
        Figura triangulo = new Triangulo(4.0, 6.0);

        System.out.printf("Área del Rectángulo: %.2f%n", rectangulo.calcularArea());
        System.out.printf("Área del Triángulo: %.2f%n", triangulo.calcularArea());
    }
}