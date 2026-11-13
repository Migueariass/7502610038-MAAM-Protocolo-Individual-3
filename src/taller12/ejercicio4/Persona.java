package taller12.ejercicio4;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está comunicándose en una reunión.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está desarrollando software.");
    }
}