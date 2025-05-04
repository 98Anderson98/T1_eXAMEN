package Universidad;
import java.util.ArrayList;
import java.util.List;


public enum EstadoInscripcion {
    PENDIENTE("Pendiente"),
    APROBADA("Aprobada"),
    RECHAZADA("Rechazada");

    private final String descripcion;

    private EstadoInscripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
