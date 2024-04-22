package Clases; // Define el paquete en el que se encuentra nuestra clase.

// La clase Alumno es una subclase de Persona.
public class AlumnoI extends Alumno {
    private String curso; // Variable privada que almacena la nota del alumno.

    // Constructor de la clase Alumno.
    public AlumnoI(String nombre, String apellido, int nota, String sexo,String curso) {
        super(nombre, apellido, nota, sexo ) ; // Llama al constructor de la clase padre (Persona).
        this.curso = curso; // Inicializa la nota del alumno con el valor proporcionado.
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

  
    
}

