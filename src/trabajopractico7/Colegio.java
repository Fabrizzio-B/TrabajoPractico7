package trabajopractico7;

public class Colegio {

    public static void main(String[] args) {
        Materia ingles1 = new Materia(3, "Inglés 1", 1);
        Materia mat = new Materia(4, "Matemática", 1);
        Materia lab1 = new Materia(1, "Laboratorio 1", 1);

        Alumno lopezM = new Alumno(1001, "López", "Martín");
        Alumno martinezB = new Alumno(1002, "Martínez", "Brenda");

        lopezM.agregarMateria(ingles1);
        lopezM.agregarMateria(mat);
        lopezM.agregarMateria(lab1);

        martinezB.agregarMateria(ingles1);
        martinezB.agregarMateria(mat);
        martinezB.agregarMateria(lab1);
        martinezB.agregarMateria(new Materia(1, "Laboratorio 1", 1));

        System.out.println("Materias de López: " + lopezM.cantidadMaterias());
        System.out.println("Materias de Martínez: " + martinezB.cantidadMaterias());

    }
}