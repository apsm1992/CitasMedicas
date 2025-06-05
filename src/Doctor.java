public class Doctor {
    String nombre;
    String especialidad;

    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String toString() {
        return nombre + " - " + especialidad;
    }
}
