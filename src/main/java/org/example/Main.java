package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<llamadasTelefonicas> cabinas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        llamadasTelefonicas llamadas = new llamadasTelefonicas();

        boolean salir = false;
        int menu, costoTotal = 0, totalLlamadas = 0, duracionTotal = 0;

        while (!salir) {
            System.out.println("Bienvenido al Menú principal");
            System.out.println("1. Crear cabina telefónica");
            System.out.println("2. Escoger cabina telefónica");
            System.out.println("3. Mostrar la información detallada por cabina");
            System.out.println("4. Consolidado total de cabinas");
            System.out.println("5. Reiniciar los valores");
            System.out.println("Digite cualquier otro número para salir");
            System.out.print("Digite la opción deseada: ");
            menu = teclado.nextInt();
            teclado.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Bienvenido al menú crear cabina");
                    cabinas.add(new llamadasTelefonicas((cabinas.size() + 1), 0, 0, 0, 0, 0, 0));
                    System.out.println("Cabina número " + (cabinas.size()) + " creada con exito");
                    break;

                case 2:
                    System.out.println("Bienvenido al menú escoger cabina");
                    System.out.println("Número de cabina");
                    for (int i = 0; i < cabinas.size(); i++) {
                        System.out.println(cabinas.get(i).getCabina());
                    }
                    System.out.print("Ingrese el número de la cabina a la cual desea ingresar: ");
                    int cabina = teclado.nextInt();
                    teclado.nextLine();
                    if (cabina > 0 && cabina <= cabinas.size()) {
                        for (int i = 0; i < cabinas.size(); i++) {
                            if (cabinas.get(i).getCabina() == cabina) {
                                System.out.println("Tipos de llamada");
                                System.out.println("1. Llamada local");
                                System.out.println("2. Llamada larga distancia");
                                System.out.println("3. Llamada celular");
                                System.out.println("Ingrese el tipo de llamada que va realizar");
                                int tipoLlamada = teclado.nextInt();
                                switch (tipoLlamada) {
                                    case 1:
                                        cabinas.get(i).setLlamadaLocal();
                                        cabinas.get(i).setMinutosLocal();
                                        break;

                                    case 2:
                                        cabinas.get(i).setLlamadaDistancia();
                                        cabinas.get(i).setMinutosDistancia();
                                        break;

                                    case 3:
                                        cabinas.get(i).setLlamadaCelular();
                                        cabinas.get(i).setMinutosCelular();
                                        break;

                                    default:
                                        System.out.println("Tipo de llamada no válido");
                                        break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Cabina inválida. Intente de nuevo");
                    }
                    break;

                case 3:
                    System.out.println("Bienvenido al menú de información por cabina");
                    System.out.println("Número de cabina");
                    for (int i = 0; i < cabinas.size(); i++) {
                        System.out.println(cabinas.get(i).getCabina());
                    }
                    System.out.print("Ingrese el número de la cabina para revisar su información: ");
                    cabina = teclado.nextInt();
                    if (cabina > 0 && cabina <= cabinas.size()) {
                        for (int i = 0; i < cabinas.size(); i++) {
                            if (cabinas.get(i).getCabina() == cabina) {
                                System.out.println("Cabina número" + cabinas.get(i).getCabina() + ": ");
                                System.out.println("El número total de llamadas locales fue de " + cabinas.get(i).getLlamadaLocal() + ", con una duración total de " + cabinas.get(i).getMinutosLocal() + " minutos, y costo total de $" + cabinas.get(i).costoLocal());
                                System.out.println("El número total de llamadas de larga distancia fue de " + cabinas.get(i).getLlamadaDistancia() + ", con una duracion total de " + cabinas.get(i).getMinutosDistancia() + " minutos, y un costo total de $" + cabinas.get(i).costoDistancia());
                                System.out.println("El número total de llamadas a celular fue de " + cabinas.get(i).getLlamadaCelular() + ", con una duracion total de " + cabinas.get(i).getMinutosCelular() + " minutos, y un costo total de $" + cabinas.get(i).costoCelular());
                                System.out.println("El número total de llamadas fue de " + cabinas.get(i).llamadasTotales() + ", con un costo total de $" + cabinas.get(i).costoTotal());
                            }
                        }
                    } else {
                        System.out.println("Cabina inválida. Intente de nuevo");
                    }
                    break;

                case 4:
                    System.out.println("Bienvenido al menú consolidad");
                    System.out.println("Número de cabina");
                    for (int i = 0; i < cabinas.size(); i++) {
                        costoTotal += cabinas.get(i).costoTotal();
                        totalLlamadas += cabinas.get(i).llamadasTotales();
                        duracionTotal += cabinas.get(i).duracionTotal();
                    }
                    System.out.println("Total de llamadas: " + totalLlamadas);
                    System.out.println("Duración total: " + duracionTotal);
                    System.out.println("Costo total: $" + costoTotal);
                    break;

                case 5:
                    for (int i = 0; i < cabinas.size(); i++) {
                        cabinas.clear();
                    }
                    System.out.println("Ha reiniciado todos los valores");
                    break;

                default:
                    salir = true;
                    break;
            }
        }
    }
}