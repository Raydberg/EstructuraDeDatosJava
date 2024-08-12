package Ejercicio1;

import java.util.Scanner;

public class UseArreglo {
    public static void PracticeArreglo() {
        Arreglo arreglo = new Arreglo();
        Scanner scanner = new Scanner(System.in);
        message("Ingrese la posicion que desea obtener");
        int position = scanner.nextInt();
        int result = arreglo.obtain(position);
        message("El valor de la posicion " +position+ " es:"+result);
        message("La suma de el array es de : " + arreglo.sumNumbers());

    }

    private static void message(String s) {
        System.out.println(s);
    }


}
