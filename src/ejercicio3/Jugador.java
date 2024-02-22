/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 * //Creado por Victor Sanchez
 * @author AlumnoT
 */
public class Jugador {
    
    int id;
    String nombre;
    int edad;
    
    public Jugador(int i, String n, int e) {
        id = i;
        nombre = n;
        edad = e;
    }
    
    public void mostrarDatos() {
        System.out.println("El jugador " + nombre + " con ID " + id + " tiene edad de " + edad);
    }
    
}
