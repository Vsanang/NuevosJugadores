/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author AlumnoT
 */
public class JugadorTenis extends Jugador {
    String ranking;
    int torneosGanados;
    
    public JugadorTenis (int i, String n, int e, String r, int t) {
        
        super(i, n, e);
        
        ranking = r;
        torneosGanados = t;
        
    }
    
    public void ganarTorneo() {
        torneosGanados ++;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("El jugador " + nombre + " con ID " + id + " tiene edad de " + edad + ", está en el ranking " + ranking + " y ha ganado " + torneosGanados + " torneos.");
    }
    
}
