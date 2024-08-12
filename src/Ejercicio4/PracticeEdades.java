package Ejercicio4;

import java.util.Scanner;

public class PracticeEdades {
    public static void edades() {
        ArregloEdades arrayEdades = new ArregloEdades();
        Scanner scanner = new Scanner(System.in);
        message("Ingrese la cantidad de valores a ingresar");
        int cantidad = scanner.nextInt();
        for (int i = 0; i < cantidad; i++) {
            message("Introdusca un valor a ingresar al arreglo");
            int value = scanner.nextInt();
            arrayEdades.adicionar(value);
        }
        message("Contenido del arreglo:");
        arrayEdades.imprimirArray();
        message("Eliminar el ultimo valor");
        arrayEdades.eliminarFinal();
        arrayEdades.imprimirArray();
    }

    public static void message(String s) {
        System.out.println(s);
    }

}
