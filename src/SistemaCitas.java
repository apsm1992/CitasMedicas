import java.io.*;
import java.util.*;

public class SistemaCitas {
    List<Doctor> doctores = new ArrayList<>();
    List<Paciente> pacientes = new ArrayList<>();
    List<Cita> citas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void inicializarArchivos() {
        File db = new File("db");
        if (!db.exists()) db.mkdirs();

        crearArchivoSiNoExiste("db/doctores.csv");
        crearArchivoSiNoExiste("db/pacientes.csv");
        crearArchivoSiNoExiste("db/citas.csv");
    }

    private void crearArchivoSiNoExiste(String path) {
        File archivo = new File(path);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Error al crear " + path);
            }
        }
    }

    public void altaDoctor() {
        System.out.print("Nombre del doctor: ");
        String nombre = scanner.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = scanner.nextLine();
        Doctor d = new Doctor(nombre, especialidad);
        doctores.add(d);
        System.out.println("Doctor registrado.");
    }

    public void altaPaciente() {
        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        Paciente p = new Paciente(nombre, telefono);
        pacientes.add(p);
        System.out.println("Paciente registrado.");
    }

    public void crearCita() {
        if (doctores.isEmpty() || pacientes.isEmpty()) {
            System.out.println("Debe haber al menos un doctor y un paciente registrado.");
            return;
        }

        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = scanner.nextLine();
        System.out.print("Hora (HH:MM): ");
        String hora = scanner.nextLine();

        System.out.println("Seleccione doctor:");
        for (int i = 0; i < doctores.size(); i++) {
            System.out.println(i + ". " + doctores.get(i));
        }
        int idxDoctor = Integer.parseInt(scanner.nextLine());

        System.out.println("Seleccione paciente:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(i + ". " + pacientes.get(i));
        }
        int idxPaciente = Integer.parseInt(scanner.nextLine());

        Cita c = new Cita(fecha, hora, doctores.get(idxDoctor), pacientes.get(idxPaciente));
        citas.add(c);
        System.out.println("Cita registrada.");
    }

    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }
        for (Cita c : citas) {
            System.out.println(c);
        }
    }
}
