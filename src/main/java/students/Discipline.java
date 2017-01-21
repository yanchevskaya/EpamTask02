package students;

/**
 * Created by Lisica on 19.01.2017.
 */
public enum Discipline {
    BIOLOGY, GEOGRAPHY, MATH, PHYSICS, HISTORY, INFORMATICS, MUSIC;


    public Subject createSubject(Student student) {
        switch (this) {
            case BIOLOGY:
                return new Biology(student);
            case MATH:
                return new Math(student);
            case INFORMATICS:
                return new Informatics(student);
            case HISTORY:
                return new History(student);
            case MUSIC:
                return new Music(student);


        }
        return null;
    }
}
