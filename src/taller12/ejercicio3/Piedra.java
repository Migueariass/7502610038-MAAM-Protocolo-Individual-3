package taller12.ejercicio3;

public class Piedra implements Corredor {
    @Override
    public void correr() {
        System.out.println("Mala práctica: Una piedra no tiene lógica para correr.");
    }
}