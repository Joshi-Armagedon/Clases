public class Cadena2 {
    public static void main(String[] args) {
        char[] arr3;
        arr3 = new char[100];
        for(int i = 0; i < arr3.length;i++){
            if((int)(arr3[i]) == 0){
                break;
            }
            System.out.println((int)(arr3[i]));
        }
        arr3[0] = 'H';
        arr3[1] = 'o';
        arr3[2] = 'l';
        arr3[3] = 97;
        arr3[4] = 10;

        char arra2[] = new char[100];
        arra2[0] = 72;
        arra2[1] = 111;
        arra2[2] = 108;
        arra2[3] = 97;
        arra2[4] = 10;

        for (int o = 0; o < 100; o++)
            System.out.print((char)(arra2[o]));
    }
}
