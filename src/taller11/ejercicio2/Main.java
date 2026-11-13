package taller11.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Miguel Arias", 3900000, 1200000);
        Empleado vendedor = new Vendedor("Isabella Valenzuela", 2400000, 8000000, 0.05);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}