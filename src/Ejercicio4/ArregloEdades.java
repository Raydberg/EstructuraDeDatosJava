package Ejercicio4;

public class ArregloEdades {
    private int []edad = new int[0];
    private int indice =0;
    public int size(){
        return indice;
    }
    public int obtener(int position){
        return edad[position];
    }
     public void ampliarArreglo(){
        int [] aux = edad;
        edad = new int[indice+1];
         for (int i = 0; i <indice ; i++) {
             edad[i]=aux[i];
         }
     }
    public void adicionar(int numero){
        if(indice==edad.length){
            ampliarArreglo();
        }
         edad[indice]=numero;
            indice++;
    }

    public void eliminarFinal(){
          indice--;
    }
    public void eliminarTodo(){
       indice=0;
    }
    public int buscarPrimeraEdadAdulta(){
        for (int i = 0; i <edad.length ; i++) {
            if(edad[i]>18){
                return edad[i];
            }
        }
        return -1;
    }

    public int incrementarEdadAdulta (){
        for (int i = 0; i <indice ; i++) {
            if(edad[i]>18){
                edad[i]+=5;
                return edad[i];
            }
        }
        return -1;
    }

    public void imprimirArray(){
        for (int i = 0; i <size() ; i++) {
            System.out.print("["+edad[i] + "]");
        }
        System.out.println();
    }
}
