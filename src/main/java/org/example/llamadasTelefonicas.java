package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class llamadasTelefonicas {
    private int cabina;
    private int llamadaLocal;
    private int llamadaDistancia;
    private int llamadaCelular;
    private int minutosLocal;
    private int minutosDistancia;
    private int minutosCelular;
    private Random duracion = new Random();
    private int duracionLlamada;

    public llamadasTelefonicas() {
    }

    public llamadasTelefonicas(int cabina, int llamadaLocal, int llamadaDistancia, int llamadaCelular, int minutosLocal, int minutosDistancia, int minutosCelular) {
        this.cabina = cabina;
        this.llamadaLocal = llamadaLocal;
        this.llamadaDistancia = llamadaDistancia;
        this.llamadaCelular = llamadaCelular;
        this.minutosLocal = minutosLocal;
        this.minutosDistancia = minutosDistancia;
        this.minutosCelular = minutosCelular;
    }

    public int getCabina() {
        return cabina;
    }

    public void setCabina(int cabina) {
        this.cabina = cabina;
    }

    public int getLlamadaLocal() {
        return llamadaLocal;
    }

    public void setLlamadaLocal() {
        this.llamadaLocal += 1;
    }

    public int getLlamadaDistancia() {
        return llamadaDistancia;
    }

    public void setLlamadaDistancia() {
        this.llamadaDistancia += 1;
    }

    public int getLlamadaCelular() {
        return llamadaCelular;
    }

    public void setLlamadaCelular() {
        this.llamadaCelular += 1;
    }

    public int getMinutosLocal() {
        return minutosLocal;
    }

    public void setMinutosLocal() {
        this.minutosLocal += duracion.nextInt(60);
    }

    public int getMinutosDistancia() {
        return minutosDistancia;
    }

    public void setMinutosDistancia() {
        this.minutosDistancia += duracion.nextInt(60);
    }

    public int getMinutosCelular() {
        return minutosCelular;
    }

    public void setMinutosCelular() {
        this.minutosCelular += duracion.nextInt(60);
    }

    public void duracion(){
        this.duracionLlamada = duracion.nextInt(60);
    }

    public int costoLocal(){
        return this.minutosLocal * 50;
    }

    public int costoDistancia(){
        return this.minutosDistancia * 350;
    }

    public int costoCelular(){
        return this.minutosCelular * 150;
    }

    public int llamadasTotales(){
        return this.llamadaLocal + this.llamadaCelular + this.llamadaDistancia;
    }

    public int costoTotal(){
        return (this.minutosCelular * 150) + (this.minutosDistancia * 350) + (this.minutosLocal * 50);
    }

    public int duracionTotal(){
        return this.minutosLocal + this.minutosCelular + this.minutosDistancia;
    }
}
