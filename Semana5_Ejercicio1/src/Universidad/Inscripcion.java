package Universidad;

public class Inscripcion {
    private Estudiante estudiante;
    private Curso curso;
    private EstadoInscripcion estado;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.estado = EstadoInscripcion.PENDIENTE;
    }

    // Getter y Setter
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public EstadoInscripcion getEstado() {
        return estado;
    }

    public void setEstado(EstadoInscripcion estado) {
        if (estado != null) {
            this.estado = estado;
        }
    }

    // 🚀 FALTA este método que usamos en Main:
    public String getEstadoDescripcion() {
        return estado.getDescripcion();
    }
}
