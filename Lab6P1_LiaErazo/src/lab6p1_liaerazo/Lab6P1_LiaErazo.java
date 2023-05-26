/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_liaerazo;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Lab6P1_LiaErazo {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            Menu();
            switch (opcion) {
                case 1 -> {
                    genRandArray();
                    isPrime();
                }
                case 2 -> {

                }
                case 3 -> {
                    seguir = false;
                }

            }
        }

    }

    public static int Menu() {
        System.out.println();
        System.out.println("1. Cuantos primos tienes?");
        System.out.println("2. Frecuencia de letras");
        System.out.println("3. Salir");
        System.out.println("Ingrese una opcion");
        opcion = leer.nextInt();
        return opcion;
    }

    public static void genRandArray() {
        System.out.println("Ingrese el tamaño del arreglo a generar:");
        int size = leer.nextInt();
        System.out.println("Ingrese el limite inferior:");
        int lim_inf = leer.nextInt();
        if ((size > 1) && (lim_inf > 0)) {

            ///creo que va otro public static
            System.out.println("Ingrese el limite superior:");
            int lim_super = leer.nextInt();
            if (lim_super > lim_inf) {

                ///creo que va otro public static
            } else {
                System.out.print("ERROR, intente de nuevo");
            }
        } else {
            System.out.print("ERROR, intente de nuevo");
        }
    }

    public static boolean isPrime() {
        boolean primo = true;
        int lim_super = 0;
        while (primo) {
            if ((lim_super == 0 || lim_super == 1) && (lim_super == 4)) {
                /*for (int i = 0; i < lim_super.lenght(); i++) {
                    char r = lim_super.charAt(i);
                    if (r >= lim_inf && r <= lim_super || r <=lim_super && r >=lim_inf) {
                    }else{
                        (r >= lim_super && r <= lim_inf || r <=lim_inf && r >=lim_super)
                    }
                }*/
                for (int n = 2; n < lim_super / 2; n++) {
                    if (lim_super % n == 0) {
                        primo = false;
                    }
                }
            } else {
                primo = false;
            }
            System.out.println("No. divisore primos:" + primo);
        }
        return primo;
    }
}
