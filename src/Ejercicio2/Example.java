package Ejercicio2;

public class Example {
    public static void example() {
        ArregloEdades arrAges = new ArregloEdades();

        message("The older age is : " + arrAges.ageOlder());
        message("The younger age is : " + arrAges.ageYounger());
        message("The number of adults :" + arrAges.canOldAge());
        message("The number of boys : " + arrAges.canYoungerAge());
        message("Primera edad adolecente : "+arrAges.searchEarlyAgeAdolescent());

    }

    private static void message(String s) {
        System.out.println(s);
    }


}
