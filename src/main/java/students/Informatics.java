package students;

/**
 * Created by Lisica on 20.01.2017.
 */
    class Informatics extends Subject {
    private Score<Double> score;
    private Student student;
    private static final Discipline INFORMATICS = Discipline.INFORMATICS;

    Informatics(Student student) {
        super(student, INFORMATICS);

    }

}