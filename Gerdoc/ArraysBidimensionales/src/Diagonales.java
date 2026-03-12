public class Diagonales {
    static int [][] matriz = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    public static void main(String[] args) {
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
        for (int i = 0; i < matriz.length; i++){
            int j = i;
            suma = suma + matriz[i][j];
            j = j - 1;
        }
        System.out.println(suma);
        suma = 0;
    }
}
