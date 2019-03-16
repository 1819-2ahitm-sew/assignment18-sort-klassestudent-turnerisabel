package at.htl.klassestudent;

public class Main {

    public static void main(String[] args) {

        Klasse einsAhitm = new Klasse(1, new Student[]{
                new Student("Michael", "Huber"),
                new Student("Max", "Mustermann"),
                new Student("Daniel", "Mayr"),
                new Student("Lisa", "Müller"),
                new Student("Kathi", "Berger")
        });
        Klasse zweiAhitm = new Klasse(2,
                new Student[]{
                        new Student("Michael", "Huber"),
                        new Student("Max", "Mustermann"),
                        new Student("Daniel", "Mayr"),
                        new Student("Lisa", "Müller"),
                        new Student("Kathi", "Berger")
                });

        zweiAhitm.sortBubble();
        ausgabe(zweiAhitm.getStudents());
        System.out.println("===============");

        einsAhitm.sortInsertion();
        ausgabe(einsAhitm.getStudents());

    }

    private static void ausgabe(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
