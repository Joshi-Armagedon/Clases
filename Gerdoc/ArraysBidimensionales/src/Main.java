import java.util.Scanner;
public class Main {
    static int[][] calif = new int[9][41];
    static char[][] materia = new char[9][12];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < materia.length; i++){
            for (int j = 0; j < materia[i].length; j++){
                System.out.println("Ingresa nombre" +"para"+ j );
                materia[i][j] = sc.next().charAt(0);
            }
            System.out.println('\n');
        }
        for (int i = 0; i < calif.length; i++){
            for (int j = 0; j < calif[i].length; j++){
                System.out.println("Ingresa calificacion" + j + "para" + materia[i]);
                calif[i][j] = sc.nextInt();
            }
            System.out.println('\n');
        }
        for (int i = 0; i < materia.length; i++){
            for (int j = 0; j < materia[i].length; j++){
                System.out.println(materia[i][j]);
            }
            System.out.println('\n');
        }
        for (int i = 0; i < calif.length; i++){
            for (int j = 0; j < calif[i].length; j++){
                System.out.println(calif[i][j]);
            }
            System.out.println('\n');
        }

    }
}