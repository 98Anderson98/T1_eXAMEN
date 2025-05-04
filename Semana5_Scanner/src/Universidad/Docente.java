package Universidad;
import java.util.ArrayList;

public class Docente {
    private String nombre;
    private ArrayList<Curso> cursosDictados = new ArrayList<>();

    public Docente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Curso> getCursosDictados() {
        return cursosDictados;
    }
}
