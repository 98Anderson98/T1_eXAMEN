package Universidad;
import java.util.*;
import java.util.Scanner;


public class SistemaAcademico {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Curso> cursosDisponibles = new ArrayList<>();
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Docente> docentes = new ArrayList<>();
    static ArrayList<Inscripcion> inscripciones = new ArrayList<>();

    public static void main(String[] args) {
        try {
            // Crear docentes, cursos, y estudiantes ingresados por el usuario
            crearDocentes();
            crearCursos();
            crearEstudiantes();

            // Registrar inscripción y notas
            registrarInscripcion();
            registrarNotas();

            // Mostrar promedio de notas
            mostrarPromedio();
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }

    public static void crearDocentes() {
        try {
            System.out.print("Ingrese el nombre del docente: ");
            String nombreDocente = scanner.nextLine();
            Docente docente = new Docente(nombreDocente);
            docentes.add(docente);
        } catch (Exception e) {
            System.out.println("Error al crear el docente: " + e.getMessage());
        }
    }

    public static void crearCursos() {
        try {
            System.out.print("Ingrese el nombre del curso: ");
            String nombreCurso = scanner.nextLine();
            Curso curso = new Curso(nombreCurso);
            cursosDisponibles.add(curso);

            // Asignar un docente al curso
            System.out.print("Ingrese el nombre del docente para este curso: ");
            String nombreDocente = scanner.nextLine();
            Docente docente = buscarDocente(nombreDocente);
            if (docente != null) {
                docente.getCursosDictados().add(curso);
            } else {
                System.out.println("Docente no encontrado.");
            }

            // Prerrequisitos del curso
            System.out.print("¿Cuántos prerrequisitos tiene este curso? ");
            int numPrerrequisitos = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            for (int i = 0; i < numPrerrequisitos; i++) {
                System.out.print("Nombre del prerrequisito: ");
                String prerrequisito = scanner.nextLine();
                Curso c = buscarCurso(prerrequisito);
                if (c != null) {
                    curso.getPrerrequisitos().add(c);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada de datos incorrecta.");
            scanner.nextLine(); // Limpiar el buffer
        } catch (Exception e) {
            System.out.println("Error al crear el curso: " + e.getMessage());
        }
    }

    public static void crearEstudiantes() {
        try {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombreEstudiante = scanner.nextLine();
            Estudiante estudiante = new Estudiante(nombreEstudiante);
            estudiantes.add(estudiante);
        } catch (Exception e) {
            System.out.println("Error al crear el estudiante: " + e.getMessage());
        }
    }

    public static void registrarInscripcion() {
        try {
            System.out.print("Ingrese el nombre del estudiante para inscripción: ");
            String nombreEstudiante = scanner.nextLine();
            Estudiante estudiante = buscarEstudiante(nombreEstudiante);
            if (estudiante == null) {
                System.out.println("Estudiante no encontrado.");
                return;
            }

            System.out.print("Ingrese el nombre del curso para inscripción: ");
            String nombreCurso = scanner.nextLine();
            Curso curso = buscarCurso(nombreCurso);
            if (curso == null) {
                System.out.println("Curso no encontrado.");
                return;
            }

            if (estudiante.getCursosAprobados().containsAll(curso.getPrerrequisitos())) {
                Inscripcion insc = new Inscripcion(estudiante, curso);
                insc.setEstado(EstadoInscripcion.APROBADA); // Estado correcto
                inscripciones.add(insc);
                System.out.println("Inscripción aprobada.");
            } else {
                Inscripcion insc = new Inscripcion(estudiante, curso);
                insc.setEstado(EstadoInscripcion.RECHAZADA); // Estado correcto
                inscripciones.add(insc);
                System.out.println("No cumple prerrequisitos. Inscripción rechazada.");
            }
        } catch (Exception e) {
            System.out.println("Error al registrar la inscripción: " + e.getMessage());
        }
    }

    public static void registrarNotas() {
        try {
            System.out.print("Ingrese el nombre del estudiante para registrar la nota: ");
            String nombreEstudiante = scanner.nextLine();
            Estudiante estudiante = buscarEstudiante(nombreEstudiante);
            if (estudiante == null) {
                System.out.println("Estudiante no encontrado.");
                return;
            }

            System.out.print("Ingrese el nombre del curso para registrar la nota: ");
            String nombreCurso = scanner.nextLine();
            Curso curso = buscarCurso(nombreCurso);
            if (curso == null) {
                System.out.println("Curso no encontrado.");
                return;
            }

            System.out.print("Ingrese la nota del estudiante: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            registrarNota(estudiante, curso, nota);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada de nota inválida. Debes ingresar un número válido.");
            scanner.nextLine(); // Limpiar el buffer
        } catch (Exception e) {
            System.out.println("Error al registrar la nota: " + e.getMessage());
        }
    }

    public static void registrarNota(Estudiante estudiante, Curso curso, double nota) {
        try {
            if (nota >= 10.5) {
                estudiante.getCursosAprobados().add(curso);
                estudiante.getNotas().add(nota); // Agregar la nota al estudiante
                System.out.println("Curso aprobado y registrado en el historial del estudiante.");
            } else {
                System.out.println("Curso reprobado.");
            }
        } catch (Exception e) {
            System.out.println("Error al registrar la nota: " + e.getMessage());
        }
    }

    public static void mostrarPromedio() {
        try {
            System.out.print("Ingrese el nombre del estudiante para mostrar el promedio: ");
            String nombreEstudiante = scanner.nextLine();
            Estudiante estudiante = buscarEstudiante(nombreEstudiante);
            if (estudiante != null) {
                double promedio = estudiante.calcularPromedio();
                System.out.println("El promedio de " + estudiante.getNombre() + " es: " + promedio);
            } else {
                System.out.println("Estudiante no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al calcular el promedio: " + e.getMessage());
        }
    }

    public static Curso buscarCurso(String nombre) {
        for (Curso c : cursosDisponibles) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public static Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public static Docente buscarDocente(String nombre) {
        for (Docente d : docentes) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                return d;
            }
        }
        return null;
    }
}