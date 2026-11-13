package taller11.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Punto 1: Intentar instanciar una clase abstracta directamente[cite: 6].
        // Descomenta la siguiente línea en tu video para mostrar el error de compilación ('Instrumento' is abstract; cannot be instantiated):
        // Instrumento inst = new Instrumento("Genérico");

        // Punto 2: Uso incorrecto sin error de compilación (mala práctica de diseño)[cite: 6].
        Instrumento miGuitarra = new Guitarra("Fender Stratocaster");
        miGuitarra.tocar();
    }
}