import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RegistroAsistencia {
    private Curso curso;
    private Map<Alumno, Boolean> asistencia;

    public RegistroAsistencia(Curso curso) {
        this.curso = curso;
        this.asistencia = new HashMap<>();
        generarAsistenciaAleatoria();
    }

    private void generarAsistenciaAleatoria() {
        Random random = new Random();
        for (Alumno alumno : curso.getAlumnos()) {
            boolean presente = random.nextBoolean();
            asistencia.put(alumno, presente);
        }
    }

    public void imprimirRegistro() {
        System.out.println("Curso: " + curso.getNombre() + " (" + curso.getCodigo() + ")");
        System.out.println("Lista de Asistencia:");
        for (Map.Entry<Alumno, Boolean> entrada : asistencia.entrySet()) {
            String estado = entrada.getValue() ? "Presente" : "Ausente";
            System.out.println("Alumno: " + entrada.getKey().getNombre() + " - " + estado);
        }
    }
}


