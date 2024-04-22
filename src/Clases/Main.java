package Clases; // Define el paquete en el que se encuentra nuestra clase.
import java.util.ArrayList; // Importa la clase ArrayList de la biblioteca estándar de Java.
import java.util.List; // Importa la interfaz List de la biblioteca estándar de Java.
// Clase principal donde se ejecuta el programa.
public class Main {
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa.
        List<Persona> personas = new ArrayList<>(); // Crea una lista de objetos de tipo Persona.
        personas.add(new Alumno("Cristian", "Torre", 9, "M")); // Añade un nuevo objeto Alumno a la lista.
        personas.add(new Profesor("Gustavo", "Klipmuller", "POO", "M")); // Añade un nuevo objeto Profesor a la lista.
        personas.add(new Empleado("Gustavo", "Lombardi", 112233445, "Profesor", "F")); // Añade un nuevo objeto Empleado
        personas.add(new Gerencia("Gustavo", "Lombardi", 112233445, "Profesor", "F", "Director"));//Añade rol gerencial                                                                                // a la lista.
        personas.add(new AlumnoI("Esteban", "Primero de mayo", 9, "M", "1B"));
        // Recorre la lista de personas.
        for (Persona p : personas) {
            if (p instanceof Alumno) { // Si el objeto es una instancia de Alumno...

                Alumno alumno = (Alumno) p; // ...lo convierte a Alumno.
                System.out.println("Datos del Alumno:"); // Imprime un mensaje.
                System.out.println("Nombre: " + alumno.getNombre()); // Imprime el nombre del alumno.
                System.out.println("Apellido: " + alumno.getApellido()); // Imprime el apellido del alumno.
                System.out.println("Nota: " + alumno.getNota()); // Imprime la nota del alumno.
                System.out.println("Sexo: " + alumno.getSexo());
                if (p instanceof AlumnoI) { // Si el objeto es una instancia de AlumnoI...
                    Alumno alumnoI = (AlumnoI) p; // ...lo convierte a AlumnoI.
                    System.out.println("Curso: " + ((AlumnoI) alumnoI).getCurso()); // Imprime el  curso del alumno.

                }
                    System.out.println(); // Imprime una línea en blanco.
                } else if (p instanceof Profesor) { // Si el objeto es una instancia de Profesor...
                    Profesor profesor = (Profesor) p; // ...lo convierte a Profesor.
                    System.out.println("Datos del Profesor:"); // Imprime un mensaje.
                    System.out.println("Nombre: " + profesor.getNombre()); // Imprime el nombre del profesor.
                    System.out.println("Apellido: " + profesor.getApellido()); // Imprime el apellido del profesor.
                    System.out.println("Materia: " + profesor.getMateria()); // Imprime la materia que enseña el
                                                                             // profesor.
                    System.out.println("Sexo: " + profesor.getSexo());
                    System.out.println(); // Imprime una línea en blanco.
                } else if (p instanceof Empleado) { // Si el objeto es una instancia de Empleado...
                    Empleado empleado = (Empleado) p; // ...lo convierte a Empleado.
                    System.out.println("Datos del Empleado:"); // Imprime un mensaje.
                    System.out.println("Nombre: " + empleado.getNombre()); // Imprime el nombre del empleado.
                    System.out.println("Apellido: " + empleado.getApellido()); // Imprime el apellido del empleado.
                    System.out.println("Cargo: " + empleado.getCargo()); // Imprime el cargo del empleado.
                    System.out.println("Sexo: " + empleado.getSexo());
                    System.out.println(); // Imprime una línea en blanco.
                    if (p instanceof Gerencia) { // Si el objeto es una instancia de AlumnoI...
                        Empleado gerencia = (Gerencia) p; // ...lo convierte a AlumnoI.
                        System.out.println("Rol gerencial: " + ((Gerencia) gerencia).getRol()); // Imprime el  del alumno.
    
                    }
                }

            }
        }
    }
