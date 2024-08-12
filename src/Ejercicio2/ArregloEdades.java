package Ejercicio2;

public class ArregloEdades {
    private int[] n = {27,22,13,12,25,11,29,70,15,20};

    public int size (){
        return  n.length;
    }
    public int obtener(int position){
        return n[position];
    }
    public int ageOlder(){
        int max = n[0];
        for (int i = 0; i <size() ; i++) {
            if (n[i]>max){
                 max = n[i];
            }
        }
        return max;
    }
    public int ageYounger(){
        int min = n[0];
        for (int i = 0; i < size(); i++) {
            if (n[i]<min){
                min=n[i];
            }
        }
        return  min;
    }

    public int canOldAge(){
        int can = 0;
        for (int i = 0; i <size() ; i++) {
            if(n[i]>18){
                can++;
            }
        }
        return  can;
    }
    public int canYoungerAge(){
        int can =0;
        for (int i = 0; i <size() ; i++) {
            if(n[i]<18) {
                can++;
            }
        }
        return can;
    }

    public int searchEarlyAgeAdolescent(){
        for (int i = 0; i <size() ; i++) {
            if(n[i]<18){
                return n[i];
            }
        }
        return -1;
    }

    private int aleatory(int min , int max){
        return (int)((max-min+1)*Math.random()) + min ;
    }
    public  void generarEdades (){
        for (int i = 0; i <size() ; i++) {
            n[i] = aleatory(10, 90);
        }
    }

}
