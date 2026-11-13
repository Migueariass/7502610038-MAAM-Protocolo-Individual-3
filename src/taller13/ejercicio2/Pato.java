package taller13.ejercicio2;

public class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println("El pato " + nombre + " está volando sobre el estanque.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato " + nombre + " está nadando en el agua.");
    }
}