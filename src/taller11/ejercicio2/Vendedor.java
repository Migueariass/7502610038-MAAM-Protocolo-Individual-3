package taller11.ejercicio2;

public class Vendedor extends Empleado {
    private double ventasRealizadas;
    private double porcentajeComision; // Ej. 0.05 para 5%

    public Vendedor(String nombre, double salarioBase, double ventasRealizadas, double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }
}