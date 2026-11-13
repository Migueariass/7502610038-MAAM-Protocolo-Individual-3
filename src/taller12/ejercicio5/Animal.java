package taller12.ejercicio5;

public class Animal implements Volador, Nadador {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println("El " + nombre + " está volando sobre el lago.");
    }

    @Override
    public void nadar() {
        System.out.println("El " + nombre + " está nadando en el lago.");
    }
}