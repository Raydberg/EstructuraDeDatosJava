package Ejercicio3;

import java.util.Scanner;

public class PracticeSueldo {
    public static void practice() {
        ArraysSueldos arraysSueldos = new ArraysSueldos();
        Scanner scanner = new Scanner(System.in);

        message("Ingrese una posicion que desea obtener");
        int value = scanner.nextInt();
        message("El numero de la posicion " + value + " es :" + arraysSueldos.obtener(value));

    }

    private static void message(String s) {
        System.out.println(s);
    }
}
