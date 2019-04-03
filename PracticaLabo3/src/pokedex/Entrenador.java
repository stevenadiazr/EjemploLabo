/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.util.ArrayList;

/**
Cuarto lugar en trabajar
 */
public class Entrenador {
    private String nombre;
    private String origen;
    private int edad;
    private int nivel;
    //Como cargara los pokemon se hace un array tipom pokemon
    private ArrayList<Pokemon> pokemon = new ArrayList<>();

    public Entrenador() {
        this.nivel = 1;
    }

    public Entrenador(String nombre, String origen, int edad, int nivel) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    public void addPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }
    
    // Constructor setter y getter y pasamos de nuevo a pokemon
    
}
