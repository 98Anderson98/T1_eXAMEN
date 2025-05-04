package Universidad;
import java.util.ArrayList;
import java.util.List;

public class Docente {
    private String nombre;
    private String id;
    private List<Curso> cursos;

    public Docente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.cursos = new ArrayList<>();
    }

    public void crearCurso(String nombre, String codigo, List<String> prerrequisitos) {
        Curso curso = new Curso(nombre, codigo, prerrequisitos);
        cursos.add(curso);
    }

    public void registrarNota(Inscripcion inscripcion, EstadoInscripcion estado) {
        inscripcion.setEstado(estado);
    }

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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
