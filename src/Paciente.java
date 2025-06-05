public class Paciente {
    String nombre;
    String telefono;

    public Paciente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String toString() {
        return nombre + " - " + telefono;
    }
}