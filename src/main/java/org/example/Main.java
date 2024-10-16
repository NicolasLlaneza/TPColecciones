package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Selecciona el ejercicio que deseas visualizar:");

            int opcion;
            for(opcion = 1; opcion <= 6; ++opcion) {
                System.out.println("" + opcion + ". Ejercicio " + opcion);
            }

            opcion = scanner.nextInt();
            String CONTRASENA_CORRECTA;
            if (opcion == 1) {
                System.out.println("Has seleccionado el Ejercicio 1.");
                ArrayList<Integer> numeros = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                int numero;

                do {
                    System.out.print("Ingresa un número (ingresa un número negativo para detener): ");
                    numero = sc.nextInt();
                    if (numero >= 0) {
                        numeros.add(numero);
                    }
                } while (numero >= 0);

                System.out.println("Los números ingresados son:");
                for (int num : numeros) {
                    System.out.println(num);
                }

                sc.close();
            } else {
                Scanner scanner7;
                if (opcion == 2) {
                    System.out.println("Has seleccionado el Ejercicio 2.");
                    ArrayList<Integer> numeros = new ArrayList<>();
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Ingresa 20 números enteros:");
                    for (int i = 0; i < 20; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        int numero = sc.nextInt();
                        numeros.add(numero);
                    }

                    int mayor = Collections.max(numeros);
                    System.out.println("El número mayor es: " + mayor);

                    int menor = Collections.min(numeros);
                    System.out.println("El número menor es: " + menor);

                    int rango = mayor - menor;
                    System.out.println("El rango (diferencia entre el mayor y el menor) es: " + rango);

                    sc.close();
                } else if (opcion == 3) {
                    System.out.println("Has seleccionado el Ejercicio 3.");
                    ArrayList<Integer> numeros = new ArrayList<>();
                    Random random = new Random();

                    for (int i = 0; i < 20; i++) {
                        int numeroPar = 2 * (random.nextInt(50) + 1);
                        numeros.add(numeroPar);
                    }

                    System.out.println("Números generados: " + numeros);

                    double suma = 0;
                    for (int num : numeros) {
                        suma += num;
                    }
                    double promedio = suma / numeros.size();
                    System.out.println("El promedio aritmético es: " + promedio);

                    int igualesAlPromedio = 0;
                    for (int num : numeros) {
                        if (num == promedio) {
                            igualesAlPromedio++;
                        }
                    }
                    System.out.println("Cantidad de números iguales al promedio: " + igualesAlPromedio);

                    int mayoresQuePromedio = 0;
                    for (int num : numeros) {
                        if (num > promedio) {
                            mayoresQuePromedio++;
                        }
                    }
                    System.out.println("Cantidad de números mayores que el promedio: " + mayoresQuePromedio);

                    int menoresQuePromedio = 0;
                    for (int num : numeros) {
                        if (num < promedio) {
                            menoresQuePromedio++;
                        }
                    }
                    System.out.println("Cantidad de números menores que el promedio: " + menoresQuePromedio);
                } else {
                    int i;
                    int numeroAleatorio;
                    if (opcion == 4) {
                        System.out.println("Has seleccionado el Ejercicio 4.");
                        ArrayList<Integer> numeros = new ArrayList<>();
                        Random random = new Random();

                        for (int j = 0; j < 50; j++) {
                            numeros.add(random.nextInt(100) + 1);
                        }

                        System.out.println("Números generados: " + numeros);

                        Scanner sc = new Scanner(System.in);
                        System.out.print("Ingresa el número que deseas buscar: ");
                        int valorBuscado = sc.nextInt();

                        boolean encontrado = false;
                        for (int j = 0; j < numeros.size(); j++) {
                            if (numeros.get(j) == valorBuscado) {
                                System.out.println("El número " + valorBuscado + " se encontró en la posición " + j);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("El número " + valorBuscado + " no se encuentra en la lista.");
                        }

                        sc.close();
                    } else if (opcion == 5) {
                        System.out.println("Has seleccionado el Ejercicio 5.");
                        ArrayList<Integer> numeros = new ArrayList<>();
                        Scanner sc = new Scanner(System.in);

                        System.out.println("Ingresa 10 números enteros:");
                        for (int f = 0; f < 10; f++) {
                            System.out.print("Número " + (f + 1) + ": ");
                            int numero = sc.nextInt();
                            numeros.add(numero);
                        }

                        ArrayList<Integer> numerosAscendentes = new ArrayList<>(numeros);
                        ArrayList<Integer> numerosDescendentes = new ArrayList<>(numeros);

                        Collections.sort(numerosAscendentes);

                        Collections.sort(numerosDescendentes, Collections.reverseOrder());

                        System.out.println("\nLista en orden ascendente: " + numerosAscendentes);
                        System.out.println("Lista en orden descendente: " + numerosDescendentes);

                        sc.close();
                    } else if (opcion == 6) {
                        System.out.println("Has seleccionado el Ejercicio 6.");
                        Scanner sc = new Scanner(System.in);
                        Matriz matriz = new Matriz();
                        String valor;

                        while (true) {
                            System.out.print("Ingresa el valor para la celda (o 'FIN' para terminar): ");
                            valor = sc.nextLine();
                            if (valor.equalsIgnoreCase("FIN")) {
                                break;
                            }

                            System.out.print("Ingresa la fila para el valor: ");
                            int fila = sc.nextInt();
                            System.out.print("Ingresa la columna para el valor: ");
                            int columna = sc.nextInt();
                            sc.nextLine();

                            Celda nuevaCelda = new Celda(fila, columna, valor);
                            matriz.agregarCelda(nuevaCelda);
                        }


                        System.out.println("\nCeldas ingresadas:");
                        matriz.mostrarMatriz();


                        System.out.print("\nIngresa la fila a buscar: ");
                        int filaBuscar = sc.nextInt();
                        System.out.print("Ingresa la columna a buscar: ");
                        int columnaBuscar = sc.nextInt();

                        String resultado = matriz.buscarValor(filaBuscar, columnaBuscar);
                        System.out.println("Resultado de la búsqueda: " + resultado);

                        sc.close();

                    } else {
                        System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 6.");
                    }
                }
            }

            scanner.close();
        }

    }
