import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido ingresa el tipo de arreglos");
        System.out.println("1.Numeros 2.Caracteres");
        int seleccion = leerNumeroEnRango(1,2, " ");
        switch (seleccion){
            case 1:
                arregloInt();
                break;
            case 2:
                arregloChar();
                break;
            default:
                break;
        }
    }

    static int leerNumeroEnRango(int min, int max, String mensaje){
        int numero = 0;
        do {
            System.out.println(mensaje);
            numero = sc.nextInt();
        }while (numero < min && numero > max);
        return numero;
    }


    static int[] ordenar(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            for (int j = i+1; j < arreglo.length; j++){
                if (arreglo[j] > arreglo[i]){
                    int espera = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = espera;
                }
            }
        }
        return arreglo;
    }

    static char[] ordenar(char[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            for (int j = i+1; j < arreglo.length; j++){
                if (arreglo[j] > arreglo[i]){
                    int espera = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = (char) espera;
                }
            }
        }
        return arreglo;
    }


    static void arregloInt(){
        System.out.println("Ingresa el tamano");
        int tamano = sc.nextInt();
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++){
            System.out.println("Ingresa el numero" + i + "para tu array");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("El arreglo ordenado es");
        arreglo = ordenar(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }
    static void arregloChar(){
        System.out.println("Ingresa el tamano");
        int tamano = sc.nextInt();
        char[] arreglo = new char[tamano];
        for (int i = 0; i < tamano; i++){
            System.out.println("Ingresa el caracter" + i + "para tu array");
            arreglo[i] = sc.next().charAt(0);
        }
        System.out.println("El arreglo ordenado es");
        arreglo = ordenar(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }
}