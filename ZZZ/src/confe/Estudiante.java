package confe;

class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas;

    
    public Estudiante() {
    }


    public Estudiante(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double[] getNotas() {
        return notas;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\nPromedio: " + String.format("%.2f", calcularPromedio()));
    }
}



