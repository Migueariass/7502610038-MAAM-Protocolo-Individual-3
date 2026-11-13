package taller12.ejercicio1;

public class Ave implements Volador, Cantante {
    private String especie;

    public Ave(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println("El " + especie + " está volando alto.");
    }

    @Override
    public void cantar() {
        System.out.println("El " + especie + " está cantando una melodía.");
    }
}