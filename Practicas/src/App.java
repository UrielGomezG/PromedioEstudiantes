import java.util.Scanner;
public class App {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        Estudiantes estudiante = new Estudiantes();
        
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(scanner.nextLine());
        
        System.out.print("Ingrese la matrícula del estudiante: ");
        estudiante.setMatricula(scanner.nextLine());
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            estudiante.getNotas()[i] = nota;
        }
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Matrícula: " + estudiante.getMatricula());
        System.out.println("Promedio: " + estudiante.calcularPromedio());
        System.out.println("Aprobado: " + (estudiante.aprobar() ? "Sí" : "No"));
        
        scanner.close();
     
    }
}