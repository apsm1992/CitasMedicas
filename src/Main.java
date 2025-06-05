import java.io.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static SistemaCitas sistema = new SistemaCitas();

    public static void main(String[] args) {
        sistema.inicializarArchivos();

        if (loginAdministrador()) {
            int opcion;
            do {
                mostrarMenu();
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        sistema.altaDoctor();
                        break;
                    case 2:
                        sistema.altaPaciente();
                        break;
                    case 3:
                        sistema.crearCita();
                        break;
                    case 4:
                        sistema.listarCitas();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 5);
        }
    }

    public static boolean loginAdministrador() {
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        return usuario.equals("admin") && contrasena.equals("1234");
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Alta de doctor");
        System.out.println("2. Alta de paciente");
        System.out.println("3. Crear cita");
        System.out.println("4. Listar citas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
} 