package taller11.ejercicio3;

public class Guitarra extends Instrumento {
    public Guitarra(String nombre) {
        super(nombre);
    }

    // Como tocar() no es abstracto en Instrumento, Java no obliga a sobrescribirlo.
    // Compila sin error, pero hereda un comportamiento genérico erróneo.
}