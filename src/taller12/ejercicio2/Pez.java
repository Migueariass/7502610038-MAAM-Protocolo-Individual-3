package taller12.ejercicio2;

public class Pez implements Nadador, Respirador {
    private String tipo;

    public Pez(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void nadar() {
        System.out.println("El pez " + tipo + " está nadando en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez " + tipo + " está respirando a través de sus branquias.");
    }
}