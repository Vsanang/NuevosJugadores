/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author AlumnoT
 */
public class JugadorFutbol extends Jugador {
    String posicion;
    int golesMarcados;
    
    public JugadorFutbol (int i, String n, int e, String p, int g) {
        
        super(i, n, e);
        
        posicion = p;
        golesMarcados = g;
        
    }
    
    public void registrarGol() {
        golesMarcados ++;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("El jugador " + nombre + " con ID " + id + " tiene edad de " + edad + ", juega en la posición " + posicion + " y ha marcado " + golesMarcados + " goles.");
    }
    
}
