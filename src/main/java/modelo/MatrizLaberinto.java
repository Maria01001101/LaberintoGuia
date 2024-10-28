/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lab2-01
 */
public class MatrizLaberinto {
    
    private int [][] laberinto;
    private Personaje personaje;
    private Enemigo enemigo;
    
    public MatrizLaberinto () {
        //Definir tamaño matriz
        laberinto = new int [][]{
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,0,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1}
        };
        
        //Inicializar al personaje y al enemigo
        personaje = new Personaje();
        enemigo = new Enemigo();
    }
    
    public int [][] getlaberinto(){
        return laberinto;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }
    
}
