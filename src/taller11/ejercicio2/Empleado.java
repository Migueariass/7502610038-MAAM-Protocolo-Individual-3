package taller11.ejercicio2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método concreto que utiliza calcularSalario() para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Cargo: " + this.getClass().getSimpleName());
        System.out.println("Nombre: " + nombre);
        System.out.printf("Salario Total: $%.2f%n", calcularSalario());
        System.out.println("-----------------------------------");
    }
}