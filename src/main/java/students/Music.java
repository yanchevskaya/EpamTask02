package students;

/**
 * Created by Lisica on 20.01.2017.
 */
    class Music extends Subject{
    private Score<Double> score;
    private Student student;
    private static final Discipline MUSIC = Discipline.MUSIC;

    Music(Student student) {
        super(student, MUSIC);

    }
}

