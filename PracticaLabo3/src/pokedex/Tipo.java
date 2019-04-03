/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.util.ArrayList;

/**
Segundo lugar en trabajar
 */
public class Tipo {
    //Hacemos una arraylist porque el pokemon puede tener 1 o 2 habilidades, lo que lo vuelve un arreglo dinámico
    private String nombre;
    private ArrayList<Tipo> debilidades = new ArrayList<>();
    private ArrayList<Tipo> ventajas = new ArrayList<>();

    public Tipo() {
    }
    
    public Tipo(String nombre) {
        this.nombre = nombre;
    }
    public Tipo(ArrayList<Tipo> debilidades) {
        this.debilidades = debilidades;
    }
    
    public Tipo(String nombre, ArrayList<Tipo> debilidades) {
        this.nombre = nombre;
        this.debilidades = debilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tipo> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(ArrayList<Tipo> debilidades) {
        this.debilidades = debilidades;
    }

    public ArrayList<Tipo> getVentajas() {
        return ventajas;
    }

    public void setVentajas(ArrayList<Tipo> ventajas) {
        this.ventajas = ventajas;
    }
            
    // Constructor setter y getter y pasamos a Habilidad
}
