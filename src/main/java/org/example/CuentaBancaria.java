package org.example;

public class CuentaBancaria {
    private String titular;
    private int saldo;
    private int numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, int saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }

    public int depositarDinero(int n1){
        return this.saldo += n1;
    }

    public void retirarDinero(int n1){
        this.saldo -= n1;
    }
}
