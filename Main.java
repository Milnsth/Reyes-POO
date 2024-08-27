import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Curso {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes;

    // Constructor y getters/setters
    // ...

    public void imprimirListaAsistencia() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Estudiante: " + estudiante.getNombre() + " (" + estudiante.getMatricula() + ") - Asistencia: " + estudiante.getAsistencia());
        }
    }
}

class Estudiante {
    private String nombre;
    private String matricula;
    private List<Boolean> asistencias;

    // Constructor y getters/setters
    // ...

    public void generarAsistenciasAleatorias(int numeroClases) {
        Random random = new Random();
        for (int i = 0; i < numeroClases; i++) {
            asistencias.add(random.nextBoolean());
        }
    }
}
