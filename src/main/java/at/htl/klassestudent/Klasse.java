package at.htl.klassestudent;

public class Klasse {

    private int klassenbezeichnung;
    private Student[] students;

    public Klasse() {
    }

    public Klasse(int klassenbezeichnung, Student[] students) {
        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

  /*  public void add(Student student){
        // wenn noch kein Array erstellt wurde, dann wird eines angelegt
        if (students == null){
            students = new Student[1];
        }
        students[students.length -1] = student;
    }
*/
    public int getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public void setKlassenbezeichnung(int klassenbezeichnung) {
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void sortInsertion() {

        for (int i = 1; i < students.length; i++) {
            Student temp = students[i];
            int j = i - 1;

            while (j >= 0 && temp.compareTo(students[j]) < 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = temp;
        }
    }

    public void sortBubble() {
        Student temp;

        for (int i = 1; i < students.length; i++) {
            for (int j = 0; j < students.length - i; j++) {

                if (students[j].compareTo(students[j + 1]) > 0) {
                   temp = students[j];
                   students[j] = students[j + 1];
                   students[j + 1] = temp;
                }
             }
        }
    }
}
