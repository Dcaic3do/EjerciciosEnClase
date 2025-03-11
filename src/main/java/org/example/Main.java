package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<producto> productos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        producto producto = new producto();
        int menu,precio,cantidad,descuento,aumento;
        double total=0;
        String nomProducto, codigo;
        boolean salir = true;

        while (salir){
            System.out.println("Bienvenido al Menú principal");
            System.out.println("1. Crear producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Reponer Stock");
            System.out.println("4. Aplicar descuento");
            System.out.println("5. Mostrar información");
            System.out.println("6. Aumentar Precio");
            System.out.println("7. Valor Total en inventario");
            System.out.println("8. Eliminar producto por código");
            System.out.println("Digite cualquier otro número para salir");
            System.out.print("Digite la opción deseada: ");
            menu = teclado.nextInt();
            teclado.nextLine();

            switch (menu){
                case 1:
                    System.out.println("Bienvenido al Menú crear producto");
                    System.out.print("Ingrese el código del producto: ");
                    codigo = teclado.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    nomProducto = teclado.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    precio = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese la cantidad del producto en stock: ");
                    cantidad = teclado.nextInt();
                    teclado.nextLine();

                    if (precio < 0){
                        System.out.println("Precio NO válido");
                    }
                    if (cantidad < 0){
                        System.out.println("Cantidad del producto en stock NO válido");
                    }

                    if (precio > 0 && cantidad > 0){
                        System.out.println("Producto ingresado correctamente");
                        productos.add(new producto(codigo, nomProducto, precio, cantidad));
                    }else{
                        System.out.println("Producto NO ingresado. Inténtelo nuevamente");
                    }
                    break;

                case 2:
                    System.out.println("Bienvenido al Menú de Venta");
                    System.out.println("Código Producto    Nombre Producto");
                    for (int i=0;i<productos.size();i++){
                        System.out.println(productos.get(i).getCodigoProducto() + "               " + productos.get(i).getNombreProducto());
                    }
                    System.out.print("Ingrese el código del producto: ");
                    codigo = teclado.nextLine();
                    for (int i=0;i<productos.size();i++){
                        if (productos.get(i).getCodigoProducto().equalsIgnoreCase(codigo)){
                            System.out.print("Ingrese la cantidad del producto: ");
                            cantidad = teclado.nextInt();
                            if (cantidad < productos.get(i).getStock()){
                                productos.get(i).vender(cantidad);
                            }else{
                                System.out.println("Cantidad insuficiente del producto en stock");
                            }
                            if (cantidad < 0){
                                System.out.println("Cantidad no válida. Ingrese número positivos");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Bienvenido al Menú reponer stock");
                    System.out.println("Código Producto    Nombre Producto");
                    for (int i=0;i<productos.size();i++){
                        System.out.println(productos.get(i).getCodigoProducto() + "               " + productos.get(i).getNombreProducto());
                    }
                    System.out.print("Ingrese el código del producto al que se le agregará stock: ");
                    codigo = teclado.nextLine();
                    for (int i=0;i<productos.size();i++){
                        if (productos.get(i).getCodigoProducto().equalsIgnoreCase(codigo)){
                            System.out.print("Ingrese la cantidad del producto " + productos.get(i).getNombreProducto() + " que se le agregará al stock: ");
                            cantidad = teclado.nextInt();
                            if (cantidad > 0){
                                System.out.println("Se le agregaron " + cantidad + " items al stock del producto - " + productos.get(i).getNombreProducto());
                                productos.get(i).reponerStock(cantidad);
                            }else{
                                System.out.println("Cantidad de stock a reponer no válida. No se pueden ingresar numeros negativos");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Bienvenido al Menú aplicar descuento");
                    System.out.println("Código Producto    Nombre Producto");
                    for (int i=0;i<productos.size();i++){
                        System.out.println(productos.get(i).getCodigoProducto() + "               " + productos.get(i).getNombreProducto());
                    }
                    System.out.print("Ingrese el código del producto al que se le aplicará el descuento: ");
                    codigo = teclado.nextLine();
                    for (int i=0;i<productos.size();i++){
                        if (productos.get(i).getCodigoProducto().equalsIgnoreCase(codigo)){
                            System.out.print("Ingrese el descuento que se le aplicará al prodcuto - " + productos.get(i).getNombreProducto() + ": ");
                            descuento = teclado.nextInt();
                            if (descuento > 0 && descuento < 100){
                                System.out.println("Se le aplicó un descuento del " + descuento + "% al producto - " + productos.get(i).getNombreProducto());
                                productos.get(i).descuento(descuento);
                            }else{
                                System.out.println("Porcentaje de descuento inválido. Ingrese numeros entre 1 y 100");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Bienvenido al Menú mostrar información");
                    System.out.println("Código Producto    Nombre Producto    Precio Producto    Cantidad en Stock");
                    for (int i=0;i<productos.size();i++){
                        System.out.println(productos.get(i).getCodigoProducto() + "               " + productos.get(i).getNombreProducto() + "              " + productos.get(i).getPrecioProducto() + "             " + productos.get(i).getStock());
                    }
                    break;

                case 6:
                    System.out.println("Bienvenido al Menú aumentar descuento");
                    System.out.println("Código Producto    Nombre Producto");
                    for (int i=0;i<productos.size();i++){
                        System.out.println(productos.get(i).getCodigoProducto() + "               " + productos.get(i).getNombreProducto());
                    }
                    System.out.print("Ingrese el código del producto al aumentara de precio: ");
                    codigo = teclado.nextLine();
                    for (int i=0;i<productos.size();i++){
                        if (productos.get(i).getCodigoProducto().equalsIgnoreCase(codigo)){
                            System.out.println("Precio Actual: " + productos.get(i).getPrecioProducto());
                            System.out.print("Ingrese el porcentaje de aumento al precio: ");
                            aumento = teclado.nextInt();
                            if (aumento > 0 && aumento < 100){
                                System.out.println("Se incremento un " + aumento + "% el precio del siguiente producto - " + productos.get(i).getNombreProducto());
                                productos.get(i).aumentarPrecio(aumento);
                            }else{
                                System.out.println("No se actualizó el precio. El porcentaje de aumento debe estar entre 1 y 100");
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.println("Bienvenido al menú total en inventario");
                    for (int i=0;i<productos.size();i++){
                        total = total + productos.get(i).valorTotal();
                    }
                    System.out.println("El total en inventario es: $" + total);
                    break;

                case 8:
                    System.out.println("Bienvenido al Menú eliminar producto");
                    System.out.println("Código Producto    Nombre Producto");
                    for (int i=0;i<productos.size();i++){
                        System.out.println(productos.get(i).getCodigoProducto() + "               " + productos.get(i).getNombreProducto());
                    }
                    System.out.print("Ingrese el código del producto que va a eliminar: ");
                    codigo = teclado.nextLine();
                    for (int i=0;i<productos.size();i++){
                        if (productos.get(i).getCodigoProducto().equalsIgnoreCase(codigo)){
                            productos.remove(i);
                            System.out.println("El producto " + productos.get(i).getNombreProducto() + " fue eliminado");
                        }
                    }
                    break;

                default:
                    salir = false;
                    break;
            }
        }
    }
}