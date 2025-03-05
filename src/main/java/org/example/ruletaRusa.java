package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ruletaRusa {
    private List<Integer> tambor;
    private int cantidadJugadores;
    private int posicionBala;
    private int posicionActual;
    private Random aleatorio;
    private boolean disparo;

    public ruletaRusa() {
        this.aleatorio = new Random();
        this.tambor = new ArrayList<>();
        for (int i=0;i<6;i++){
            tambor.add(i);
        }
        this.posicionBala = aleatorio.nextInt((this.tambor.size() + 1));
        this.posicionActual = aleatorio.nextInt((this.tambor.size() + 1));
    }

    public ruletaRusa(List<Integer> tambor, int cantidadJugadores, int bala, int posicionActual, Random aleatorio) {
        this.tambor = tambor;
        this.cantidadJugadores = cantidadJugadores;
        this.posicionBala = bala;
        this.posicionActual = posicionActual;
        this.aleatorio = aleatorio;
    }

    @Override
    public String toString() {
        return "ruletaRusa{" +
                "cantidadJugadores=" + cantidadJugadores +
                ", posicionBala=" + posicionBala +
                ", posicionActual=" + posicionActual +
                '}';
    }

    public boolean disparo() {
        return disparo;
    }

    public boolean disparar(){
        this.disparo = false;
        if (posicionActual == posicionBala){
            disparo = true;
        }else if (posicionActual >= tambor.size()){
            posicionActual = 1; // Reiniciar el contador del tambor
        }else{
            posicionActual += 1;
        }
        return disparo;
    }
}
