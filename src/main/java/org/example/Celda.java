package org.example;

public class Celda { int fila;
    int columna;
    String valor;

    // Constructor para inicializar la celda
    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    // Método para obtener el valor de la celda
    public String obtenerValor() {
        return valor;
    }

    // Método para obtener una representación en String de la celda
    @Override
    public String toString() {
        return "Celda[" + "fila=" + fila + ", columna=" + columna + ", valor='" + valor + "']";
}
}
