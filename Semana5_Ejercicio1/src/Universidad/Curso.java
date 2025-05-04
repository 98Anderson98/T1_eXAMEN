package Universidad;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private List<String> prerrequisitos;
    private List<Inscripcion> inscritos;

    public Curso(String nombre, String codigo, List<String> prerrequisitos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.prerrequisitos = prerrequisitos;
        this.inscritos = new ArrayList<>();
    }

    public boolean validarPrerrequisitos(Estudiante estudiante) {
        List<String> cursosAprobados = estudiante.obtenerCursosAprobados();
        return cursosAprobados.containsAll(prerrequisitos);
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscritos.add(inscripcion);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(List<String> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public List<Inscripcion> getInscritos() {
        return inscritos;
    }

    public void setInscritos(List<Inscripcion> inscritos) {
        this.inscritos = inscritos;
    }
}
