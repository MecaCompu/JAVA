package Clases; // Define el paquete en el que se encuentra nuestra clase.

// La clase Empleado es una subclase de Persona.
public class Empleado extends Persona {
    private String cargo; // Variable privada que almacena el cargo del empleado.

    // Constructor de la clase Empleado.
    public Empleado(String nombre, String apellido, int numDoc, String cargo, String sexo) {
        super(nombre, apellido, numDoc, 0, "", sexo); // Llama al constructor de la clase padre (Persona).
        this.cargo = cargo; // Inicializa el cargo del empleado con el valor proporcionado.
    }

    // Método getter para el cargo.
    public String getCargo() {
        return cargo; // Devuelve el cargo del empleado.
    }

    // Método setter para el cargo.
    public void setCargo(String cargo) {
        this.cargo = cargo; // Establece el cargo del empleado con el valor proporcionado.
    }
}
