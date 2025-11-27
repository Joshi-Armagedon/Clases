import java.util.Scanner;

public class DiagonalesConScanner {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el numero de columnas y filas para tu matriz nxn");
        int tamano = leer.nextInt();
        int [][] matriz = new int[tamano][tamano];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingresa el numero para x= " + i + " y para y= " + j);
                matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
        }

        int suma = 0;
        System.out.println("Esta es tu matriz");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] +  " ");
            }
            System.out.println(" ");
        }
        System.out.println('\n');
        System.out.println("Esta es la suma de filas");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                suma = suma + matriz[i][j];
            }
            System.out.println(suma);
            suma = 0;
        }
        System.out.println('\n');
        System.out.println("Esta es la suma de columnas");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                suma = suma + matriz[j][i];
            }
            System.out.println(suma);
            suma = 0;
        }
        System.out.println('\n');
        System.out.println("Esta es la suma de diagonales");
        for (int i = 0; i < matriz.length; i++){
            suma = suma + matriz[i][i];
        }
        System.out.println(suma);
        suma = 0;
        System.out.println('\n');
        for (int i = 0; i < matriz.length; i++){
            int j = i;
            suma = suma + matriz[i][j];
            j = j - 1;
        }
        System.out.println(suma);
        suma = 0;
    }
}
