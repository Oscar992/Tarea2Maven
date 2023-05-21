package utility;

import model.Pokemon;

import java.util.List;

public class Sorts {

    public static void bubbleSort(List<Pokemon> pokemonList) {
        for (var i = 0; i < pokemonList.size() - 1; i++) {
            if (pokemonList.get(i).getAtk() < pokemonList.get(i + 1).getAtk()) {
                final var aux = pokemonList.get(i);
                pokemonList.add(i, pokemonList.get(i + 1));
                pokemonList.add(i + 1, aux);
            }
        }
    }

    public static void bubbleSortMenorMayor(List<Pokemon> pokemonList) {
        for (var i = 0; i < pokemonList.size(); i++) {
            for (var j = i + 1; j < pokemonList.size(); j++) {
                if (pokemonList.get(j).getNombre().compareTo(pokemonList.get(i).getNombre()) > 0) {
                    final var aux = pokemonList.get(i);
                    pokemonList.add(i, pokemonList.get(j));
                    pokemonList.add(j, aux);
                }
            }
        }
    }
}