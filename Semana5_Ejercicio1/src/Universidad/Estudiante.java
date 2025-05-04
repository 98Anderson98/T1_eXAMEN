package Universidad;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String id;
    private List<Inscripcion> inscripciones;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirse(Curso curso) {
        Inscripcion inscripcion = new Inscripcion(this, curso);
        if (curso.validarPrerrequisitos(this)) {
            inscripcion.setEstado(EstadoInscripcion.APROBADA);
        } else {
            inscripcion.setEstado(EstadoInscripcion.RECHAZADA);
        }
        inscripciones.add(inscripcion);
        curso.agregarInscripcion(inscripcion);
    }

    public List<String> obtenerCursosAprobados() {
        List<String> aprobados = new ArrayList<>();
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getEstado() == EstadoInscripcion.APROBADA) {
                aprobados.add(inscripcion.getCurso().getCodigo());
            }
        }
        return aprobados;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
}


