package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public void agregarCelda(Celda celda) {
        matrizCuadrada.add(celda);
    }

    public String buscarValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.obtenerValor();
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }

    public void mostrarMatriz() {
        for (Celda celda : matrizCuadrada) {
            System.out.println(celda);
        }
    }
}
