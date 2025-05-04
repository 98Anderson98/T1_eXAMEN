package Universidad;
import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Curso> prerrequisitos = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Curso> getPrerrequisitos() {
        return prerrequisitos;
    }
}
