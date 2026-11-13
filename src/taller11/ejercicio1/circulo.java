package taller11.ejercicio1;

public class circulo extends figura {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}