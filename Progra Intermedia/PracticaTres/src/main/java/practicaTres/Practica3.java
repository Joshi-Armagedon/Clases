package practicaTres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        List<Profesor> prof = new ArrayList<>();
        List<Alumno> alum = new ArrayList<>();

        // Profesores (faltaba uno para que sean 5)
        prof.add(new Profesor("Juan", "Perez", "Perez", 234784));
        prof.add(new Profesor("Lucas", "Lobos", "Gaitan", 235284));
        prof.add(new Profesor("Francisco", "Garza", "Garcia", 234765));
        prof.add(new Profesor("Joaquin", "Rodriguez", "Uribe", 235384));
        prof.add(new Profesor("Mario", "Lopez", "Diaz", 999999));

        // Alumnos
        alum.add(new Alumno("Cesar Adrián", "Camacho", "Curiel", 865784));
        alum.add(new Alumno("Santiago", "Espinosa", "Ramos", 237634));
        alum.add(new Alumno("Daniel", "Ortega", "Muñoz", 238744));
        alum.add(new Alumno("Rodrigo", "Esparza", "Lopez", 234674));
        alum.add(new Alumno("Ramon", "Juarez", "Valdez", 676767));

        do {
            System.out.println("MENÚ");
            System.out.println("1. Mostrar alumnos");
            System.out.println("2. Mostrar profesores");
            System.out.println("3. Agregar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Número no valido");
                sc.next();
                continue;
            }

            switch (opcion) {

                case 1:
                    System.out.println("Lista de alumnos:");
                    for (Alumno a : alum) {
                        System.out.println(a);
                    }
                    break;

                case 2:
                    System.out.println("nLista de profesores:");
                    for (Profesor p : prof) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Apellido paterno:");
                    String ap = sc.nextLine();

                    System.out.println("Apellido materno:");
                    String am = sc.nextLine();

                    System.out.println("Boleta:");
                    int boleta = sc.nextInt();

                    alum.add(new Alumno(nombre, ap, am, boleta));
                    System.out.println("Alumno agregado.");
                    break;

                case 4:
                    System.out.println("Boleta a eliminar:");
                    int b = sc.nextInt();

                    boolean eliminado = false;

                    for (int i = 0; i < alum.size(); i++) {
                        if (alum.get(i).getBoleta() == b) {
                            alum.remove(i);
                            eliminado = true;
                            System.out.println("Alumno eliminado.");
                            break;
                        }
                    }

                    if (!eliminado) {
                        System.out.println("No se encontró el alumno.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }
}