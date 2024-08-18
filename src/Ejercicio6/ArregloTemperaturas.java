package Ejercicio6;

import java.text.Bidi;

public class ArregloTemperaturas {

    private int [] temperatura = new int [0];
    private int indice = 0;

    public int size (){
        return  indice;
    }
    public int obtener(int position){
        return  temperatura[position];
    }
    public void ampliarArreglo(){
        int [] aux = temperatura;
        temperatura=new int[indice+1];
        for (int i = 0; i <size() ; i++) {
            temperatura[i]=aux[i];
        }
    }

    public void adicionar(int value){
        if(indice==size()){
            ampliarArreglo();
        }
        temperatura[indice]=value;
        indice++;

    }
    public void eliminarFinal(){
        indice--;
    }
    public void eliminarTodo(){
        indice=0;
    }
    public double temperaturaMasBaja(){
        for (int i = size()-1; i >=0 ; i--) {
            if(temperatura[i]<0){
                return temperatura[i];
            }
        }
        return -1;
    }

    private int buscar(int value){
        for (int i = 0; i <size() ; i++) {
            if(temperatura[i]==value){
                return temperatura[i];
            }
        }
        return -1;
    }

    private void  intercambiar(int pos1,int pos2){
         int aux = temperatura[pos1];
         temperatura[pos1]=temperatura[pos2];
         temperatura[pos2]=aux;
    }

    private void buscarAdicionar(int value){
        int valueAdicionar = buscar(value);
        if(valueAdicionar==-1){
            adicionar(value);
        }
    }

    public void primeroAlFinal(){
        for (int i = 0; i <indice-1 ; i++) {
            intercambiar(i,i+1);
        }
    }
  public void buscarEliminar(int value){
        int dataValue = buscar(value);
        if(dataValue!=-1) {
            for (int i = 0; i < indice - 1; i++) {
                intercambiar(i, i + 1);
            }
            indice--;
        }
  }
  public void imprimirArray(){
      for (int i = 0; i <size(); i++) {
          System.out.print("["+temperatura[i]+"]");
      }
      System.out.println();
  }

}
