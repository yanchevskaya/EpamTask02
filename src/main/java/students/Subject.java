package students;

/**
 * Created by Lisica on 20.01.2017.
 */
public abstract class Subject <T extends Number> {

    private Score score;
    Student student;
    Discipline discipline;

    public Subject(Student student, Discipline discipline) {
        this.student = student;
        this.discipline = discipline;
    }


    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }


        String nameOfSubject(){
        return discipline.toString();
    }

    public String toString() {
        return student.toString() + "\n"+discipline.toString()+"\n"
                +score.getValue();
    }

}





