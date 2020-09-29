package com.clientes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String menu =
                "         * 1 para agregar productos a clientes\n" +
                "         * 2 para consultar productos con documento de identidas\n" +
                "         * 3 Eliminar un producto\n" +
                "         * 4 salir de la aplicacion";
        Scanner in = new Scanner(System.in);
        /**
         * MENU APLICACION GESTION DE CLIENTES
         * 1 para agregar productos a clientes
         * 2 para consultar productos con documento de identidas
         * 3 Eliminar un producto
         * 4 salir de la aplicacion
         */

        //Uso clico do while() para iniciar menu
        @Deprecated(since = "1.2",forRemoval = true)
        Integer opMenu = new Integer(0);
        /**
         * Segun el concepto de polimorfismo un objeto puede tener multiples formas
         * con la estructura de clase que se entrega por favor implementar el concepto de poliformismo
         */


        do{

            System.out.println(menu);
            opMenu = in.nextInt();
            switch (opMenu.toString()){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("El valor ingresado no es una opcion de menu");
                    break;
            }
        }while (!opMenu.toString().equals("4"));
        in.close();

    }
}
