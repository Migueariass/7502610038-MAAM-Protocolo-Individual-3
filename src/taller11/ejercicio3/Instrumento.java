package taller11.ejercicio3;

public abstract class Instrumento {
    protected String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    // Punto 2: Método concreto definido en lugar de abstracto (mala práctica sin error de compilación)[cite: 6]
    public void tocar() {
        System.out.println("Sonido genérico de instrumento (implementación por defecto incorrecta).");
    }
}