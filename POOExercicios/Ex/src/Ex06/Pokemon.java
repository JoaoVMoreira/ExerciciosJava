package Ex06;

import java.util.Random;

public class Pokemon {
    public String pokemon, tipo;

    public Pokemon(String pokemon, String tipo){
        this.pokemon = pokemon;
        this.tipo = tipo;
    }

    public void mostraDados(){
        System.out.println("Pokemon: "+this.pokemon);
        System.out.println("Tipo: "+this.tipo);

        Random nivel = new Random();
        int min = 0;
        int max = 100;

        System.out.println("Nivel: " + nivel.nextInt(max));
    }
}
