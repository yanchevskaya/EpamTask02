import org.junit.Before;
import org.junit.Test;
import students.Discipline;
import students.Group;
import students.Score;
import students.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Lisica on 20.01.2017.
 */
public class TestStudents {

        Group informatics = new Group(Discipline.INFORMATICS, 15);
        Group music = new Group(Discipline.MUSIC, 5);

        Student[] allStudents = new Student[30];
        Student maria = new Student("Maria", "Sokolova", 3);
        Student petr = new Student("Petr", "Brezhnev", 5);
        Student alice = new Student("Alice", "Yanchevskaya", 5);
        Student adam = new Student("Adam", "Smitt", 2);

    @Before
    public void before() {
        alice.add(Discipline.INFORMATICS);
        alice.add(Discipline.MATH);
        alice.add(Discipline.BIOLOGY);
        maria.add(Discipline.INFORMATICS);
        maria.add(Discipline.MATH);
        maria.add(Discipline.BIOLOGY);
        petr.add(Discipline.INFORMATICS);
        petr.add(Discipline.MATH);
        petr.add(Discipline.BIOLOGY);
        adam.add(Discipline.MUSIC);
        adam.add(Discipline.HISTORY);

        allStudents[0] = alice;
        allStudents[1] = maria;
        allStudents[2] = petr;
        allStudents[3] = adam;

        informatics.create(allStudents);
        music.create(allStudents);
    }

    @Test
    public void createGroup() {

        assertEquals("Group INFORMATICS. List of student: \n" +
                "Alice Yanchevskaya\n" +
                "Maria Sokolova\n" +
                "Petr Brezhnev\n", informatics.listOfStudent());

        assertEquals("Group MUSIC. List of student: \n" +
                "Adam Smitt\n",music.listOfStudent());

    }

    @Test

    public void Studentscores(){
        alice.addScore(Discipline.MATH, new Score<Double>(4.5));
        alice.addScore(Discipline.INFORMATICS, new Score<Double>(5.5));
        alice.addScore(Discipline.BIOLOGY, new Score<Integer>(5));
        adam.addScore(Discipline.HISTORY, new Score<Integer>(4));
        adam.addScore(Discipline.MUSIC, new Score<Double> (9.4));

        Score[] aliceScore = alice.getAllScore(alice.getDiscipline());
        assertEquals("List os scores of Alice Yanchevskaya:\n" +
                "INFORMATICS - 5.5\n" +
                "MATH - 4.5\n" +
                "BIOLOGY - 5\n", alice.listOfScores(aliceScore));

        Score[]adamScore = adam.getAllScore(adam.getDiscipline());
        assertEquals("List os scores of Adam Smitt:\n" +
                "MUSIC - 9.4\n" +
                "HISTORY - 4\n", adam.listOfScores(adamScore));

    }
}
