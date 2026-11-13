package taller11.ejercicio1;

public abstract class figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.printf("El área de la figura (%s) es: %.2f%n",
                this.getClass().getSimpleName(), calcularArea());
    }
}