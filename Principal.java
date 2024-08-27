public class Principal {
    public static void main(String[] args) {
        // Crear un curso
        RegistroAsistencia cursoPoo = new RegistroAsistencia("Programación Orientada a Objetos", "POO101");

        // Crear estudiantes aleatorios y agregarlos al curso
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Estudiante estudiante = new Estudiante("Estudiante " + i, "MAT" + i, 15);
            cursoPoo.agregarEstudiante(estudiante);
        }

        // Imprimir la lista de asistencia
        cursoPoo.imprimirListaAsistencia();
    }
}
}