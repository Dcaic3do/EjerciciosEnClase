package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int candidato,opcion,voto,influencia,candidato1=0,candidato2=0,candidato3=0,internet1=0,radio1=0,television1=0,internet2=0,radio2=0,television2=0,internet3=0,radio3=0,television3=0;
        boolean salir = true;
        Scanner teclado = new Scanner(System.in);
        while (salir){
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Votar por un candidato");
            System.out.println("2. Costo de campaña por influencia");
            System.out.println("3. Vaciar las urnas");
            System.out.println("4. Conocer el numero total de votos");
            System.out.println("5. Porcentaje de votos obtenidos por cada candidato");
            System.out.println("6. Costo promedio de campaña en las elecciones");
            System.out.println("Digite cualquier otro numero para salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("MENU VOTACIÓN");
                    System.out.println("1. Candidato 1");
                    System.out.println("2. Candidato 2");
                    System.out.println("3. Candidato 3");
                    System.out.print("Ingrese el numero del candidato por el que desea votar: ");
                    voto = teclado.nextInt();
                    switch (voto){
                        case 1:
                            candidato1+=1;
                            System.out.println("1. Publicidad en internet");
                            System.out.println("2. Publicidad en radio");
                            System.out.println("3. Publicidad en television");
                            System.out.print("¿Por qué canal fue influenciado su voto? ");
                            influencia = teclado.nextInt();
                            switch (influencia){
                                case 1:
                                    internet1 += 700000;
                                    break;
                                case 2:
                                    radio1 += 200000;
                                    break;
                                case 3:
                                    television1 += 600000;
                                    break;
                                default:
                                    candidato1-=1;
                                    System.out.println("OPCIÓN NO VÁLIDA!");
                                    System.out.println("Su voto NO fue registrado correctamente");
                                    break;
                            }
                            break;
                        case 2:
                            candidato2+=1;
                            System.out.println("1. Publicidad en internet");
                            System.out.println("2. Publicidad en radio");
                            System.out.println("3. Publicidad en television");
                            System.out.print("¿Por qué canal fue influenciado su voto? ");
                            influencia = teclado.nextInt();
                            switch (influencia){
                                case 1:
                                    internet2 += 700000;
                                    break;
                                case 2:
                                    radio2 += 200000;
                                    break;
                                case 3:
                                    television2 += 600000;
                                    break;
                                default:
                                    candidato2-=1;
                                    System.out.println("OPCIÓN NO VÁLIDA!");
                                    System.out.println("Su voto NO fue registrado correctamente");
                                    break;
                            }
                            break;
                        case 3:
                            candidato3+=1;
                            System.out.println("1. Publicidad en internet");
                            System.out.println("2. Publicidad en radio");
                            System.out.println("3. Publicidad en television");
                            System.out.print("¿Por qué canal fue influenciado su voto? ");
                            influencia = teclado.nextInt();
                            switch (influencia){
                                case 1:
                                    internet3 += 700000;
                                    break;
                                case 2:
                                    radio3 += 200000;
                                    break;
                                case 3:
                                    television3 += 600000;
                                    break;
                                default:
                                    candidato3-=1;
                                    System.out.println("OPCIÓN NO VÁLIDA!");
                                    System.out.println("Su voto NO fue registrado correctamente");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Candidato NO válido!");
                    }
                    break;
                case 2:
                    System.out.println("MENU COSTO POR INFLUENCIA");
                    System.out.println("1. Candidato 1");
                    System.out.println("2. Candidato 2");
                    System.out.println("3. Candidato 3");
                    System.out.print("Ingrese el numero del candidato del que desea conocer el costo de su campaña: ");
                    candidato = teclado.nextInt();
                    switch (candidato){
                        case 1:
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de internet es: $" + internet1 );
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de radio es: $" + radio1 );
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de internet es: $" + television1 );
                            break;
                        case 2:
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de internet es: $" + internet2 );
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de radio es: $" + radio2 );
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de internet es: $" + television2 );
                            break;
                        case 3:
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de internet es: $" + internet3 );
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de radio es: $" + radio3 );
                            System.out.println("El costo de campaña del candidato " + candidato + " por influencia de internet es: $" + television3 );
                            break;
                    }
                    break;
                case 3:
                    System.out.println("MENU VACIAR URNAS");
                    candidato1=candidato2=candidato3=internet1=radio1=television1=internet2=radio2=television2=internet3=radio3=television3=0;
                    System.out.println("Urnas vaciadas!");
                    break;
                case 4:
                    System.out.println("MENU NUMERO TOTAL DE VOTOS");
                    System.out.println("Candidato 1: " + candidato1 + " votos");
                    System.out.println("Candidato 2: " + candidato2 + " votos");
                    System.out.println("Candidato 3: " + candidato3 + " votos");
                    System.out.println("Total: " + (candidato1+candidato2+candidato3) + " votos");
                    break;
                case 5:
                    try{
                        System.out.println("MENU PORCENTAJE DE VOTOS POR CANDIDATO");
                        System.out.println("Candidato 1: " + ((candidato1*100/(candidato1+candidato2+candidato3))) + "% de los votos");
                        System.out.println("Candidato 2: " + ((candidato2*100/(candidato1+candidato2+candidato3))) + "% de los votos");
                        System.out.println("Candidato 3: " + ((candidato3*100/(candidato1+candidato2+candidato3))) + "% de los votos");
                    }catch(ArithmeticException e){
                        System.out.println("No hay votos Registrado");
                    }
                    break;
                case 6:
                    try{
                        System.out.println("MENU COSTO PROMEDIO DE CAMPAÑA");
                        System.out.println("El costo promedio de la campaña del candidato Candidato 1 es: $" + (internet1+radio1+television1/candidato1));
                        System.out.println("El costo promedio de la campaña del candidato Candidato 2 es: $" + (internet2+radio2+television2/candidato2));
                        System.out.println("El costo promedio de la campaña del candidato Candidato 3 es: $" + (internet3+radio3+television3/candidato3));
                    }catch(ArithmeticException e){
                        System.out.println("No hay votos Registrado");

                    }

                    break;
                default:
                    salir = false;
                    break;
            }
        }
    }
}