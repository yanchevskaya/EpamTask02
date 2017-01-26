package students;

/**
 * Created by Lisica on 20.01.2017.
 */
    class History extends Subject {
    private Score<Integer> score;
    private Student student;
    private static final Discipline HiSTORY = Discipline.HISTORY;

     History(Student student) {
        super(student, HiSTORY);

    }

}