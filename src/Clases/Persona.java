package Clases; // Define el paquete en el que se encuentra nuestra clase.

// Clase pública Persona.
public class Persona {
    // Variables privadas de la clase Persona.
    private String nombre = ""; // Nombre de la persona.
    private String apellido = ""; // Apellido de la persona.
    private String profesion = ""; // Profesión de la persona.
    private int edad = 0; // Edad de la persona.
    private int numDoc = 0; // Número de documento de la persona.
    private String sexo = ""; // Sexo de la persona.
    
    // Constructor de la clase Persona.
    public Persona(String nombre, String apellido,int numDoc, int edad, String profesion, String sexo) {
        this.nombre = nombre; // Inicializa el nombre de la persona con el valor proporcionado.
        this.apellido = apellido; // Inicializa el apellido de la persona con el valor proporcionado.   
        this.edad = edad; // Inicializa la edad de la persona con el valor proporcionado.
        this.numDoc = numDoc; // Inicializa el número de documento de la persona con el valor proporcionado.
        this.profesion = profesion; // Inicializa la profesión de la persona con el valor proporcionado.
        this.sexo = sexo; // Inicializa la sexo de la persona con el valor proporcionado.
    }
    
    // Método getter para el nombre.
    public String getNombre() {
        return nombre; // Devuelve el nombre de la persona.
    }

    // Método setter para el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre; // Establece el nombre de la persona con el valor proporcionado.
    }

    // Método getter para el apellido.
    public String getApellido() {
        return apellido; // Devuelve el apellido de la persona.
    }

    // Método setter para el apellido.
    public void setApellido(String apellido) {
        this.apellido = apellido; // Establece el apellido de la persona con el valor proporcionado.
    }

    // Método getter para la profesión.
    public String getProfesion() {
        return profesion; // Devuelve la profesión de la persona.
    }

    // Método setter para la profesión.
    public void setProfesion(String profesion) {
        this.profesion = profesion; // Establece la profesión de la persona con el valor proporcionado.
    }

    // Método getter para la edad.
    public int getEdad() {
        return edad; // Devuelve la edad de la persona.
    }

    // Método setter para la edad.
    public void setEdad(int edad) {
        this.edad = edad; // Establece la edad de la persona con el valor proporcionado.
    }

    // Método getter para el número de documento.
    public int getNumDoc() {
        return numDoc; // Devuelve el número de documento de la persona.
    }

    // Método setter para el número de documento.
    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc; // Establece el número de documento de la persona con el valor proporcionado.
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}



