package students;

/**
 * Created by Lisica on 20.01.2017.
 */
     class Math extends Subject {
    private Score<Double> score;
    private Student student;
    private static final Discipline MATH = Discipline.MATH;

    Math(Student student) {
        super(student, MATH);

    }
}