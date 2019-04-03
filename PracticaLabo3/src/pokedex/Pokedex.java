/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UCA
 */
public class Pokedex{
    //Hacemos una array estatica, para tener un arreglo de tipos
    static ArrayList<Tipo> defaultTipos = new ArrayList<>();
    //vamos a meter los tipos por defecto
    //creamos llenarTipos
    //hacemos static el scanner
    static Scanner in = new Scanner(System.in);
    //en el main todo es static
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = true;
        Entrenador e = new Entrenador();
        llenarEntrenador(e);
        
        int op; 
        do{
            System.out.println("----------MENU----------");
            System.out.println("1. Ingresar pokemon");
            op = in.nextInt(); in.nextLine();
            
            switch(op){
                case 1:
                    crearPokemon(e); break;
                case 2:
                    showPokemon(e);
            }
            
        }while(flag);

    }
    //TODO LO ESTATICO SE EJECUTA DE PRIMERO
    
    public static void crearPokemon(Entrenador e){
        Pokemon p = new Pokemon();
        System.out.println("Ingrese nombre");
        p.setNombre(in.nextLine());
        System.out.println("Ingrese daño");
        p.setDanio(in.nextInt()); in.nextLine();
        System.out.println("Ingrese Velocidad");
        p.setSpeed(in.nextInt()); in.nextLine();
        e.addPokemon(p);
    }
    
    public static void showPokemon(Entrenador e){
        e.getPokemon().forEach(Pokemon ->{
            System.out.println(Pokemon.toString());
        });
    }
    
    public static void llenarTipos(){
        ArrayList<Tipo> debilidades = new ArrayList<>();
        debilidades.add(new Tipo("Lucha"));
        defaultTipos.add(new Tipo("Nomal", debilidades));
        debilidades.clear();
        defaultTipos.add(new Tipo("Fuego"));
//        debilidades.clear();
        defaultTipos.add(new Tipo("Agua"));
//        debilidades.clear();
        defaultTipos.add(new Tipo("Veneno"));
//        debilidades.clear();
        defaultTipos.add(new Tipo("Hielo"));
//        debilidades.clear();
        defaultTipos.add(new Tipo("Dragon"));
//        debilidades.clear();
    }
    
    public static Entrenador llenarEntrenador(Entrenador e){
        System.out.println("Ingrese nombre: ");
        e.setNombre(in.nextLine());
        System.out.println("Ingrese origen: ");
        e.setOrigen(in.nextLine());
        System.out.println("Ingrese edad; ");
        e.setEdad(in.nextInt());
        in.nextLine();
        
        return e;
    }

}
