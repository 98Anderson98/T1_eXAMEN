package Universidad;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Curso> cursosAprobados = new ArrayList<>();
    private ArrayList<Double> notas = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Curso> getCursosAprobados() {
        return cursosAprobados;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    
    public double calcularPromedio() {
        if (notas.isEmpty()) {
            throw new ArithmeticException("No hay notas registradas.");
        }
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
