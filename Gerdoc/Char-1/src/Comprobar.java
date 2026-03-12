import java.util.Scanner;

public class Comprobar {
    public static void main(String[] args) {
        char[] Lista = new char[100];
        int k = 0;
        Lista[k++] = 'h';
        Lista[k++] = 'H';
        Lista[k++] = 'e';
        Lista[k++] = 'l';
        Lista[k++] = 'l';
        Lista[k++] = 'O';
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa algo");
        String ola = sc.nextLine();
        char[] cars = new char[ola.length()];
        for (int i = 0; i < ola.length(); i++){
            cars[i] = ola.charAt(i);
        }

        int Num = 0;
        int May = 0;
        int Min = 0;
        int Simbolo = 0;


        for(int i = 0; i < 100; i++ ){
            boolean esNum = Lista[i] >= 48 && Lista[i] <= 57;
            boolean esMay = Lista[i] >= 65 && Lista[i] <= 90;
            boolean esMin = Lista[i] >= 97 && Lista[i] <= 122;
            if(Lista[i] == 0){
                break;
            }
            if (esNum){
                Num++;
                System.out.println(Lista[i] + " es numero");
            } else if (esMay) {
                May++;
                System.out.println(Lista[i] + " es mayuscula");
            } else if (esMin) {
                Min++;
                System.out.println(Lista[i] + " es minuscula");
            }else{
                Simbolo++;
                System.out.println(Lista[i] + " es simbolo");
            }
        }
        System.out.println("Hay " + Num + " numeros");
        System.out.println("Hay " + May + " mayusculas");
        System.out.println("Hay " + Min + " minusculas");
        System.out.println("Hay " + Simbolo + " simbolos");
    }
}
