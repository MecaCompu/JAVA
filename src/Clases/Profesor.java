package Clases; // Define el paquete en el que se encuentra nuestra clase.

// La clase Profesor es una subclase de Persona.
public class Profesor extends Persona {
    private String materia; // Variable privada que almacena la materia que enseña el profesor.

    // Constructor de la clase Profesor.
    public Profesor(String nombre, String apellido, String materia, String sexo) {
        super(nombre, apellido, 0, 0, "", sexo); // Llama al constructor de la clase padre (Persona).
        this.materia = materia; // Inicializa la materia que enseña el profesor con el valor proporcionado.
    }

    // Método getter para la materia.
    public String getMateria() {
        return materia; // Devuelve la materia que enseña el profesor.
    }

    // Método setter para la materia.
    public void setMateria(String materia) {
        this.materia = materia; // Establece la materia que enseña el profesor con el valor proporcionado.
    }
}

