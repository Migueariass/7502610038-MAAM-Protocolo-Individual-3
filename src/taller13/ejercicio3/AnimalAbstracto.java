package taller13.ejercicio3;

public abstract class AnimalAbstracto {
    // PUNTO 2: Descomentar el siguiente método en el video para mostrar el error de compilación:
    // Modifier 'default' not allowed here (los métodos predeterminados 'default' son exclusivos de las interfaces;
    // en una clase abstracta se definen métodos concretos normales sin 'default').

    /*
    default void dormir() {
        System.out.println("Durmiendo...");
    }
    */

    // Forma correcta en una clase abstracta (método concreto):
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}