package Universidad;
public class Inscripcion {
    private Estudiante estudiante;
    private Curso curso;
    private EstadoInscripcion estado;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.estado = EstadoInscripcion.PENDIENTE; // Estado por defecto
    }

    public EstadoInscripcion getEstado() {
        return estado;
    }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }
}
