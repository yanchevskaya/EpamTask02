package students;

/**
 * Created by Lisica on 19.01.2017.
 */
public class Test {

    public static void main(String[] args) {
        Student[] allStudents = new Student[100];


        Student alice = new Student("Alice", "Yanchevskaya", 5);
        alice.add(Discipline.INFORMATICS);
        alice.add(Discipline.MATH);
        alice.add(Discipline.BIOLOGY);
        Student maria = new Student("Maria", "Sokolova", 3);
        maria.add(Discipline.INFORMATICS);
        maria.add(Discipline.MATH);
        maria.add(Discipline.BIOLOGY);
        Student petr = new Student("Petr", "Brezhnev", 5);
        petr.add(Discipline.INFORMATICS);
        petr.add(Discipline.MATH);
        petr.add(Discipline.BIOLOGY);
        Student adam = new Student("Adam", "Smitt", 2);
        adam.add(Discipline.MUSIC);
        adam.add(Discipline.HISTORY);

        allStudents[0] = alice;
        allStudents[1] = maria;
        allStudents[2] = petr;
        allStudents[3] = adam;
        System.out.println(alice.listOfDiscipline());
        System.out.println(maria.listOfDiscipline());
        System.out.println(petr.listOfDiscipline());
        System.out.println(adam.listOfDiscipline());


        Group informatics = new Group(Discipline.INFORMATICS, 10);
        informatics.create(allStudents);
        System.out.println(informatics.listOfStudent());
        Group music = new Group(Discipline.MUSIC, 5);
        music.create(allStudents);

        alice.addScore(Discipline.MATH, new Score<Double>(4.5));
        alice.addScore(Discipline.INFORMATICS, new Score<Double>(5.5));
        alice.addScore(Discipline.BIOLOGY, new Score<Integer>(5));
        adam.addScore(Discipline.HISTORY, new Score<Integer>(4));
        adam.addScore(Discipline.MUSIC, new Score<Double>(9.4));


        System.out.println(informatics.listOfScores());
        System.out.println(music.listOfScores());

        Score[] aliceScore = alice.getAllScore(alice.getDiscipline());
        System.out.println(alice.listOfScores(aliceScore));

        Score[]adamScore = adam.getAllScore(adam.getDiscipline());
        System.out.println(adam.listOfScores(adamScore));


        }

}