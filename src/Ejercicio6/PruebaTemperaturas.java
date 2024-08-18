package Ejercicio6;

import java.util.Scanner;

public class PruebaTemperaturas {
    public static void prueba (){
        ArregloTemperaturas arregloTemperaturas = new ArregloTemperaturas();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            message("Introduce una temperatura");
            int valueTemperatura = scanner.nextInt();
            arregloTemperaturas.adicionar(valueTemperatura);
        }
        arregloTemperaturas.imprimirArray();
        arregloTemperaturas.buscarEliminar(3);
        arregloTemperaturas.imprimirArray();

    }

    private static void message(String s){
        System.out.println(s);
    }


}
