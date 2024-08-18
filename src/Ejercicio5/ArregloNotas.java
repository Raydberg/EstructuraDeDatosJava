package Ejercicio5;

public class ArregloNotas {
    private int[] notas = new int[0];
    private int indice = 0;

    public int size() {
        return indice;
    }

    public int obtener(int position) {
        return notas[position];
    }

    public void ampliarArreglo() {
        int aux[] = notas;
        notas = new int[indice + 1];
        for (int i = 0; i < size(); i++) {
            notas[i] = aux[i];
        }
    }

    public void adicionar(int value) {
        if (indice == size()) {
            ampliarArreglo();
        }
        notas[indice] = value;
        indice++;
    }

    public void eliminarFinal() {
        indice--;
    }

    public void eliminarTodo() {
        indice = 0;
    }

    public int buscarUltimaNotaDesaprobada() {
        for (int i = size() - 1; i >= 0; i--) {
            if (notas[i] <= 13) {
                return notas[i];
            }
        }
        return -1;
    }

    public int decrementarNotaDesaprobatoria() {
        int notaDisminuida = buscarUltimaNotaDesaprobada() - 2;
        if (notaDisminuida < 0) {
            return notaDisminuida = 0;
        }
        return notaDisminuida;
    }

    public int remplazarUltimaNotaDesaprobada() {
        int ultimaNotaDesaprobada = buscarUltimaNotaDesaprobada();
        int ultimaNota = notas[indice - 1];
        for (int i = 0; i < size(); i++) {
            if (notas[i] == ultimaNotaDesaprobada) {
                notas[i] = ultimaNota;
                return ultimaNotaDesaprobada;
            }

        }
        return -1;

    }

    public void imprimirArray() {
        for (int i = 0; i < size(); i++) {
            System.out.print("[" + notas[i] + "]");
        }
        System.out.println();
    }
}
