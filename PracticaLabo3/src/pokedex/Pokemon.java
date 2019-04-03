/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

//EL PROGRAMA GIRA EN TORNO A ESTA CLASE   

import java.util.ArrayList;

public class Pokemon {
    //Ponemos los atributos
    private String nombre;
    private int vida;
    private int nivel;
    private int exp;
    private int danio;
    private int speed;
    //Solo ponemos los atributos
    //Una vez terminado entrenador regresamos y ponemos los Arraylist "tipo" y "entrenador" y posteriormente sus setter y getter
    private ArrayList<Tipo> tipos = new ArrayList<>();
    private ArrayList<Habilidad> habilidades = new ArrayList<>();
    //Regresamos de pokedex
    private static String test; 
    
    
    
    /*Iniciamos dando los valores que queremos, en este caso se deja fijo
    el nivel, la vida y la exp(dando a entender que pasa cuando capturas uno nuevo)
    Se piden nombre, danio y speed dando a entender que esas caracteristicas difieren en esas habilidades
    */
    public Pokemon(String nombre, int danio, int speed){
        this.vida = 100;
        this.nivel = 1;
        this.exp = 0;
        this.nombre = nombre;
        this.danio = danio;
        this.speed = speed;
    }
    
    public Pokemon(){
        this.vida = 100;
        this.nivel = 1;
        this.exp = 0;
    }
    //Dejamos un constructor vacío

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    
    // Con el constructor y los setter y getter creados nos pasamos a tipo
    //Luego de agregar los ArrayList hacemos los dos constructores de abajo
    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
    //finalizaado esto vamos a pokedex

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", vida=" + vida + ", nivel=" + nivel + ", exp=" + exp + ", danio=" + danio + ", speed=" + speed + ", tipos=" + tipos + ", habilidades=" + habilidades + '}';
    }
    
    
}
