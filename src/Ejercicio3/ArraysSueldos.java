package Ejercicio3;

public class ArraysSueldos {
    public double []n = {2400.5,1500.2,800.4,100.2,4700.1,600.0,3300.8,2600.6,5100.9,2000.7};

    public int size (){
        return n.length;
    }
    public double obtener(int position){
        return n[position];
    }
    public double sueldoPromedio(){
        double sum = 0;
        for (int i = 0; i <size() ; i++) {
            sum+=n[i];
        }
        return sum/size();
    }

    public double sueldoMayor(){
        double max = n[0];
        for (int i = 0; i <size() ; i++) {
            if (n[i]>max){
                max=n[i];
            }
        }
        return max;
    }

    public double sueldoMenor(){
        double min = n[0];
        for (int i = 0; i <size() ; i++) {
            if(n[i]<min){
                min=n[i];
            }
        }
        return min;
    }
    public double canMayoresSueldoPromedio(){
        int can =0;
        for (int i = 0; i <size() ; i++) {
            if(n[i]>=sueldoPromedio()) {
                can++;
            }
        }
        return can;
    }

    public double canMenoresSueoldoPromedio(){
        int can =0;

        for (int i = 0; i <size() ; i++) {
            if (n[i]<=sueldoPromedio()){
                can++;
            }
        }
        return can;
    }
    public double buscarPrimerSueldoMayorAlMinimo(){
        for (int i = 0; i <size() ; i++) {
            if(n[i]>850.0){
                return n[i];
            }
        }
        return -1;
    }

    public double buscarUltimoSueldoMenorAlMinimo(){
        for (int i = size()-1; i>=0; i--) {
            if(n[i]<850.0){
                return n[i];
            }
        }
        return -1;
    }


}
