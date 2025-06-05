public class Cita {
    String fecha;
    String hora;
    Doctor doctor;
    Paciente paciente;

    public Cita(String fecha, String hora, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public String toString() {
        return fecha + " " + hora + " | Doctor: " + doctor.nombre + " | Paciente: " + paciente.nombre;
    }
}
