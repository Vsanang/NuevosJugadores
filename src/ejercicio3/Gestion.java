/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Atributos
        HashMap<Integer, Jugador> jugadoresPorId = new HashMap<>();
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        int operacion;
        int jugadorSeleccionado;
        String repetir2;
        boolean repetir = false;
        int idTMP;
        String nombreTMP;
        int edadTMP;
        String PosicionTMP;
        int golesTMP;
        String rankingTMP;
        int torneosTMP;
        
        do {
            
            System.out.println("""
                               MENU DE JUGADORES
                               1. Mostrar informacion completa de un jugador
                               2. Agregar jugador de futbol
                               3. Agregar jugador de Tenis
                               4. Registrar gol a jugador de futbol
                               5. Registrar torneo ganado a jugador de tenis
                               0. Salir
                               """);
            operacion = sc.nextInt();
            
            switch (operacion) {
                case 1:
                    
                    System.out.println("Introduzca el ID del jugador que quiere mostrar sus datos: ");
                    jugadorSeleccionado = sc.nextInt();
                    jugadoresPorId.get(jugadorSeleccionado);
                    
                    
                    break;
                case 2:
                    
                    System.out.println("Introduzca el ID del jugador a añadir: ");
                    idTMP = sc.nextInt();
                    System.out.println("Introduzca el nombre del jugador a añadir: ");
                    sc.nextLine();
                    nombreTMP = sc.nextLine();
                    System.out.println("Introduzca la edad del jugador a añadir: ");
                    edadTMP = sc.nextInt();
                    System.out.println("Introduzca la posicion del jugador a añadir: ");
                    sc.nextLine();
                    PosicionTMP = sc.nextLine();
                    System.out.println("Introduzca los goles marcados del jugador a añadir: ");
                    golesTMP = sc.nextInt();
                    
                    JugadorFutbol jugador = new JugadorFutbol(idTMP, nombreTMP, edadTMP, PosicionTMP, golesTMP);
                    jugadoresPorId.put(idTMP, jugador);
                    
                    break;
                case 3:
                    
                    System.out.println("Introduzca el ID del jugador a añadir: ");
                    idTMP = sc.nextInt();
                    System.out.println("Introduzca el nombre del jugador a añadir: ");
                    sc.nextLine();
                    nombreTMP = sc.nextLine();
                    System.out.println("Introduzca la edad del jugador a añadir: ");
                    edadTMP = sc.nextInt();
                    System.out.println("Introduzca el ranking del jugador a añadir: ");
                    sc.nextLine();
                    rankingTMP = sc.nextLine();
                    System.out.println("Introduzca los torneos ganados del jugador a añadir: ");
                    torneosTMP = sc.nextInt();
                    
                    JugadorTenis jugador2 = new JugadorTenis(idTMP, nombreTMP, edadTMP, rankingTMP, torneosTMP);
                    jugadoresPorId.put(idTMP, jugador2);
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
            
            
        } while (seguir);
        
        
    }
    
}
