package taller11.ejercicio1;

class Main {
    public static void main(String[] args) {
        figura circulo = new circulo(5.0);
        figura rectangulo = new rectangulo(4.0, 6.0);

        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}