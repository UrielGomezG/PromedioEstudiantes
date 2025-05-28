import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 5 objetos Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        System.out.println("=== Estudiante 1 ===");
        System.out.print("Nombre: ");
        estudiante1.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante1.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante1.setNota(i, scanner.nextDouble());
        }

        System.out.println("=== Estudiante 2 ===");
        System.out.print("Nombre: ");
        estudiante2.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante2.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante2.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();

        System.out.println("=== Estudiante 3 ===");
        System.out.print("Nombre: ");
        estudiante3.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante3.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante3.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();

        System.out.println("=== Estudiante 4 ===");
        System.out.print("Nombre: ");
        estudiante4.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante4.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante4.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();

        System.out.println("=== Estudiante 5 ===");
        System.out.print("Nombre: ");
        estudiante5.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        estudiante5.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            estudiante5.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine();

        System.out.println("\n=== RESULTADOS ===");
        mostrarInfo(estudiante1);
        mostrarInfo(estudiante2);
        mostrarInfo(estudiante3);
        mostrarInfo(estudiante4);
        mostrarInfo(estudiante5);
    }

    public static void mostrarInfo(Estudiante e) {
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Matrícula: " + e.getMatricula());
        System.out.printf("Promedio: %.2f%n", e.calcularPromedio());
        System.out.println("Aprobado: " + (e.aprobar() ? "Sí" : "No"));
        System.out.println("--------------------------");
    }
}
