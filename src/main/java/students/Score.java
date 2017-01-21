package students;

/**
 * Created by Lisica on 20.01.2017.
 */
public class Score <T extends Number> {
    private T value;
    private Subject subject;
    public Score(){}
    public Score(T value){
        this.value=value;
    }
    public Score(T value, Subject subject){
        this (value);
        this.subject = subject;
    }


     T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
           }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
