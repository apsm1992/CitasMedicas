# Sistema de Administración de Citas para Consultorio Clínico

Este proyecto simula un sistema de administración de citas médicas utilizando Java. Permite registrar doctores, pacientes, y agendar citas, todo con control de acceso mediante un administrador.

## Instalación y configuración

1. **Requisitos**
   - Java Development Kit (JDK) 11
   - IntelliJ IDEA Community Edition
   - Git

2. **Pasos para instalar y configurar**
   - Clonar el repositorio:
     ```bash
     git clone https://github.com/apsm1992/CitasMedicas
     ```
   - Abrir el proyecto en IntelliJ IDEA.
   - Asegurarse de que el JDK 11 esté correctamente configurado en el proyecto.
   - Ejecutar el archivo `Main.java` para iniciar el programa.
  
# Acerca de

**Citas Médicas** es una aplicación desarrollada en Java que simula un sistema de administración de citas para un consultorio clínico.

Permite a un administrador iniciar sesión y realizar las siguientes acciones:
- Dar de alta doctores con nombre y especialidad.
- Registrar pacientes con nombre y teléfono.
- Crear citas médicas asociando fecha, hora, doctor y paciente.
- Visualizar todas las citas registradas.

Los datos se almacenan en archivos `.csv` en la carpeta `db/`, y se regeneran si no existen.

Este proyecto fue desarrollado como parte del curso de Programación Orientada a Objetos, con el objetivo de aplicar conceptos como clases, herencia, encapsulamiento y persistencia básica de datos.
# Proyecto

## Diagrama de flujo

![image](https://github.com/user-attachments/assets/141d33b6-4b60-4530-9b07-7956a064c74f)


---

## Clases del sistema

### `Main`
- Clase principal que ejecuta el sistema.
- Métodos:
  - `main(String[] args)`: Punto de entrada del programa.
  - `loginAdministrador()`: Solicita credenciales del administrador.
  - `mostrarMenu()`: Imprime el menú principal en consola.

---

### `SistemaCitas`
- Controlador central del sistema. Administra listas de doctores, pacientes y citas.
- Métodos:
  - `inicializarArchivos()`: Crea archivos CSV si no existen.
  - `cargarDatosDesdeArchivos()`: Carga información previa.
  - `altaDoctor()`: Crea un nuevo doctor.
  - `altaPaciente()`: Crea un nuevo paciente.
  - `crearCita()`: Genera una cita y la guarda.
  - `listarCitas()`: Muestra todas las citas registradas.

---

### `Doctor`
- Representa un doctor del consultorio.
- Atributos:
  - `nombre: String`
  - `especialidad: String`

---

### `Paciente`
- Representa un paciente registrado.
- Atributos:
  - `nombre: String`
  - `telefono: String`

---

### `Cita`
- Representa una cita médica.
- Atributos:
  - `fecha: String`
  - `hora: String`
  - `doctor: Doctor`
  - `paciente: Paciente`


## Uso del programa

1. Al iniciar el programa, se solicita un nombre de usuario y contraseña de administrador.
2. Una vez autenticado, se despliega un menú con las siguientes opciones:
   - Dar de alta doctores
   - Dar de alta pacientes
   - Crear cita médica
   - Relacionar cita con doctor y paciente
   - Listar todas las citas registradas
   - Cerrar sesión

Cada opción guía al usuario paso a paso mediante la consola para realizar la acción deseada.

## Ejecuta la clase Main.java.

Inicia sesión como administrador:

Usuario: admin

Contraseña: 1234

Usa el menú para registrar doctores, pacientes y citas.




## Créditos

- Desarrollado por: Angel Policarpo Soteldo Malave
- Curso: Programación en Java
- Institución: Tec Milenio
- Año: 2025

## Licencia

Este proyecto está licenciado bajo la institucion de Tec Milenio.
