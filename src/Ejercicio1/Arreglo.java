package Ejercicio1;

public class Arreglo {
    private int[] n = {25, 27, 22, 24, 29, 20, 23};

    public int size() {
        return n.length;
    }

    public int obtain(int position) {
        if(position>=0 && position<size()){
            return n[position];
        }else{
            System.out.println("Indice Incorrecto");
        }
        return -1;
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += n[i];
            return sum;
        }
        return -1;
    }

    public int posPrimaryNumberMenor25() {
        for (int i = 0; i < size(); i++) {
            if (n[i] < 25) {
                return i;
            }
        }
        return -1;
    }

    private int aleatorio(int min, int max) {
        return (int) ((max - min + 1) * Math.random()) + min;
    }


    public void generate() {
        for (int i = 0; i < size(); i++) {
            n[i] = aleatorio(100, 999);
        }
    }
}
