package at.htl.klassestudent;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void student_compareTwoStudents_Succes() {
        Student maxi = new Student("Maxi", "Müller");
        Student susi = new Student("Susi", "Scholz");

        int compare = maxi.compareTo(susi);
        assertThat(compare, lessThan(0));
    }

    @Test
    public void student_compareSameStudents_Succes() {
        Student maxi1 = new Student("Maxi", "Müller");
        Student maxi2 = new Student("Maxi", "Müller");

        int compare2 = maxi1.compareTo(maxi2);
        assertThat(compare2, is(0));
    }

    @Test
    public void student_compareTwoStudents2_Succes() {
        Student susi = new Student("Susi", "Scholz");
        Student maxi2 = new Student("Maxi", "Müller");

        int compare3 = susi.compareTo(maxi2);
        assertThat(compare3, greaterThan(0));
    }
}