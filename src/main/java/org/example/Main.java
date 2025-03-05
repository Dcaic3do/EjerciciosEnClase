package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ruletaRusa ruleta = new ruletaRusa();
        Scanner teclado = new Scanner(System.in);
        List<String> jugadores = new ArrayList<>();
        int cantidadJugadores,opciones;
        String disparar,jugador;
        boolean salir = false;


        System.out.print("Ingrese el número de jugadores: ");
        cantidadJugadores = teclado.nextInt();
        teclado.nextLine();

        for (int i=0;i<cantidadJugadores;i++){
            System.out.print("Ingrese el nombre del jugador " + (i+1) + ": ");
            jugador = teclado.nextLine();
            jugadores.add(jugador);
        }
        while (salir == false){
            while (ruleta.disparo() == false){
                for (int i=0;i<jugadores.size();i++){
                    System.out.print("Jugador " + (i+1) + " " + jugadores.get(i) + " presione enter para disparar");
                    disparar = teclado.nextLine();
                    ruleta.disparar();
                    if (ruleta.disparo() == true){
                        System.out.println("El jugador " + (i+1) + " " + jugadores.get(i) + " ha muerto");
                        break;
                    }else{
                        System.out.println("El jugador " + (i+1) + " " + jugadores.get(i) + " ha sobrevivido");
                    }
                }
            }
            System.out.println("Quiere reiniciar el juego");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.println("Digite la opción deseada: ");
            opciones = teclado.nextInt();
            teclado.nextLine();
            if (opciones == 1) {
                salir = true;
                System.out.println("Muchas gracias por jugar");
            }
        }
    }
}