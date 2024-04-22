package Clases; // Define el paquete en el que se encuentra nuestra clase.

// La clase Alumno es una subclase de Persona.
public class Alumno extends Persona {
    private int nota; // Variable privada que almacena la nota del alumno.

    // Constructor de la clase Alumno.
    public Alumno(String nombre, String apellido, int nota, String sexo) {
        super(nombre, apellido, 0, 0, "", sexo); // Llama al constructor de la clase padre (Persona).
        this.nota = nota; // Inicializa la nota del alumno con el valor proporcionado.
    }

    // Método  para devolver la nota.
    public int getNota() {
        return nota; // Devuelve la nota del alumno.
    }

    // Método setter para la nota.
    public void setNota(int nota) {
        this.nota = nota; // Establece la nota del alumno con el valor proporcionado.
    }
}

