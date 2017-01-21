package students;

/**
 * Created by Lisica on 20.01.2017.
 */
public class Group  {

    private Student[]list;
    Discipline discipline;
    Subject subject;

    public Group (Discipline discipline, int ammount){
        list = new Student[ammount];
        this.discipline = discipline;
    }


    public void create (Student [] oi) {
        for (Student student : oi) {
            if (student == null) break;
            if (student.consist(discipline)) {
                add(student);
            }
        }
    }

    public String listOfStudent (){
        StringBuilder sb = new StringBuilder();
        for (Student student : list) {
            if (student == null)
                break;
            sb.append(student.toString()).append("\n");
        }
        return "Group "+discipline+ ". List of student: \n"+sb;
    }

     String listOfScores (){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.length; i++){
            if (list[i]==null)
                break;
            sb.append(list[i].toString()).append(" - ").append((list[i].getScore(discipline) == null) ?
                    "no scores" : list[i].getScore(discipline).getValue()).append("\n");
        }
        return "Group "+discipline+ ". Scores of student: \n"+sb;

    }


    private void add (Student stud){
        if (list[list.length-1]!=null){
            System.out.println("You can't add any more students in this group");
            return;
        }
        for (int i=0; i<list.length; i++){
            if (list[i]==null) {
                list[i] = stud;
                break;
            }
            }
}


}