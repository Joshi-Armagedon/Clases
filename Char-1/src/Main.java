public class Main {
    public static void main(String[] args) {
        char[] arr;
        arr = new char[100];
        arr[0] = 65;
        arr[1] = 73;
        arr[2] = 108;
        arr[3] = 108;
        arr[4] = 108;
        arr[5] = 108;
        arr[6] = 108;
        arr[7] = 108;
        int contadorConsonantes = 0;
        int contadorLongitud = 0;
        //verificar consonantes
        for (int i = 0; i < arr.length; i++){
            int ascii = arr[i];
            int[] asciiVocales = {65, 97, 69, 101, 73, 105, 79, 111, 85, 117};
            for (int o = 0; o < asciiVocales.length; o++){
                boolean Coincide = ascii != asciiVocales[o];
                if (Coincide){
                    contadorConsonantes++;
                }
            }

        }
        //contar longitud
        for (int i = 0; i < 100; i++){
            if (arr[i] != 0){
                contadorLongitud++;
            }
        }

        //Imprime resultado
        System.out.println("La palabra es + ");
        System.out.println(arr);
        System.out.println("El numero de consonantes es + " + contadorConsonantes);
    }
}