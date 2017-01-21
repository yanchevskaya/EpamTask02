package students;

/**
 * Created by Lisica on 20.01.2017.
 */
     class Biology extends Subject {

    private Score<Integer> []score;
    private Student student;
    private static final Discipline discipline = Discipline.BIOLOGY;

    Biology(Student student) {
        super(student, discipline);
    }



    }


