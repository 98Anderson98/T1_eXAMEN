package Universidad;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Crear un docente
        Docente docente = new Docente("Prof. García", "D001");

        // Crear cursos
        docente.crearCurso("Introducción a la Programación", "CS101", List.of());
        docente.crearCurso("Programación Avanzada", "CS201", List.of("CS101"));

        // Obtenemos los cursos creados
        Curso cursoIntro = docente.getCursos().get(0);  // CS101
        Curso cursoAvanzado = docente.getCursos().get(1);  // CS201

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Ana López", "E001");
        // Inscribir al estudiante en Introducción a la Programación (no requiere prerrequisitos)
        estudiante.inscribirse(cursoIntro);

        // Mostrar inscripciones después de primer curso
        System.out.println("Inscripciones del estudiante después de primer intento:");
        mostrarInscripciones(estudiante);

        // Simular que aprobó el curso introducción
        // Normalmente esto lo haría el docente, pero lo forzamos aquí:
        for (Inscripcion i : estudiante.getInscripciones()) {
            if (i.getCurso().getCodigo().equals("CS101")) {
                i.setEstado(EstadoInscripcion.APROBADA);
            }
        }

        // Ahora intentar inscribirse a Programación Avanzada (requiere CS101 aprobado)
        estudiante.inscribirse(cursoAvanzado);

        // Mostrar inscripciones finales
        System.out.println("\nInscripciones del estudiante después de segundo intento:");
        mostrarInscripciones(estudiante);
    }

    private static void mostrarInscripciones(Estudiante estudiante) {
        for (Inscripcion i : estudiante.getInscripciones()) {
            System.out.println("- Curso: " + i.getCurso().getNombre() +
                               " | Estado: " + i.getEstadoDescripcion());
        }
    }

}
