package Clases; // Define el paquete en el que se encuentra nuestra clase.

// La clase Alumno es una subclase de Persona.
public class Gerencia extends Empleado {
    private String rol; // Variable privada que almacena la nota del alumno.

    // Constructor de la clase Alumno.
    public Gerencia(String nombre, String apellido, int numDoc, String cargo, String sexo, String rol) {
        super(nombre,apellido, numDoc, cargo,sexo) ; // Llama al constructor de la clase padre (Persona).
        this.rol = rol; // Inicializa la nota del alumno con el valor proporcionado.
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

  
    
}
