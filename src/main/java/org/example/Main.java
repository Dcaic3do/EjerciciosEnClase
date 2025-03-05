package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria ob1 = new CuentaBancaria("Daniel Caicedo",0,1);
        CuentaBancaria ob2 = new CuentaBancaria("Felipe Galvis",0,2);
        CuentaBancaria ob3 = new CuentaBancaria("Daniel Caiga",0,3);
        CuentaBancaria ob4 = new CuentaBancaria("Nicole Alvarez",1000000,4);
        Scanner teclado = new Scanner(System.in);

        List<CuentaBancaria> Cuentas = new ArrayList<>();

        Cuentas.add(ob1);
        Cuentas.add(ob2);
        Cuentas.add(ob3);
        Cuentas.add(ob4);

        int opcion,agregar,retirar,Cuenta;
        boolean salir1 = true, salir2 = true;

        while (salir1) {
            System.out.println("Bienvenido al menú principal");
            System.out.println("1. Ingresar a su cuenta");
            System.out.println("2. Crear una Nueva cuenta");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción deseada: ");
            agregar = teclado.nextInt();
            teclado.nextLine();
            switch (agregar){
                case 1:
                    while(salir2){
                        boolean salir3 = true;
                        System.out.println("Bienvenido al Menu de cuentas");
                        System.out.println("# de Cuenta     Titular");
                        for (int i = 0;i < Cuentas.size(); i++){
                            System.out.println(Cuentas.get(i).getNumeroCuenta() + "               " + Cuentas.get(i).getTitular());
                        }
                        System.out.println("Ingrese 0 para crear una nueva cuenta");
                        System.out.println("Ingrese el número de cuenta: ");
                        Cuenta = teclado.nextInt();
                        for (int i = 0;i < Cuentas.size(); i++){
                            if (Cuenta == (Cuentas.get(i).getNumeroCuenta())){
                                while (salir3) {
                                    System.out.println("Bienvenid@ " + Cuentas.get(i).getTitular());
                                    System.out.println("1. Depositos");
                                    System.out.println("2. Retirar");
                                    System.out.println("3. Información de la cuenta");
                                    System.out.println("4. Salir");
                                    System.out.println("Digite cualquier otro número para salir");
                                    System.out.print("Ingrese la opción deseada: ");
                                    opcion = teclado.nextInt();

                                    switch (opcion) {
                                        case 1:
                                            int deposito;
                                            System.out.print("Ingrese el monto que desea depositar sin comas y sin puntos: $");
                                            deposito = teclado.nextInt();
                                            if (deposito > 0) {
                                                System.out.println("Ha depositado $" + deposito + " correctamente");
                                                Cuentas.get(i).depositarDinero(deposito);
                                            } else {
                                                System.out.println("Monto Inválido");
                                                System.out.println("Intentelo Nuevamente");
                                            }
                                            break;

                                        case 2:
                                            System.out.print("Ingrese el monto que desea retirar sin comas y sin puntos: $");
                                            retirar = teclado.nextInt();
                                            if (retirar <= Cuentas.get(i).getSaldo() && retirar > 0) {
                                                System.out.println("Usted ha retirado $" + retirar);
                                                Cuentas.get(i).retirarDinero(retirar);
                                            } else {
                                                System.out.println("Monto Inválido");
                                                System.out.println("Intentelo Nuevamente");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("Titular: " + Cuentas.get(i).getTitular());
                                            System.out.println("Saldo: $" + Cuentas.get(i).getSaldo());
                                            System.out.println("Numero de Cuenta: " + Cuentas.get(i).getNumeroCuenta());
                                            break;

                                        default:
                                            salir3 = false;
                                            break;
                                    }
                                }
                                break;
                            }
                            if (Cuenta > Cuentas.size() || Cuenta <= 0){
                                System.out.println("Número de cuenta no válido");
                            }
                        }
                        break;
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del titular de la cuenta: ");
                    String titularCuenta = teclado.nextLine();
                    Cuentas.add(new CuentaBancaria(titularCuenta,0,(Cuentas.size()+1)));
                    break;

                default:
                    salir1 = false;
                    break;
            }
        }
    }
}