package students;

/**
 * Created by Lisica on 19.01.2017.
 */
public class Student {
    private String name;
    private String lastName;
    private Discipline[] discipline;
    private Score [] score;
    private Subject [] subjects;
    Biology biology;


    public Student(String name, String lastName, int numberOfDiscipline){
        this.name = name;
        this.lastName = lastName;
        discipline = new Discipline[numberOfDiscipline];
        subjects = new Subject[numberOfDiscipline];
    }

    public void add (Discipline dis){
            if (discipline[discipline.length-1]!=null){
            System.out.println("You can't add any more discipline");
            return;
        }
       for (int i=0; i<discipline.length; i++){
           if (discipline[i]==null) {
               discipline[i] = dis;
               subjects [i] = dis.createSubject(this);
               break;
           }
                  }
    }

    public void addScore(Discipline dis, Score score) {
        for (int i = 0; i < discipline.length; i++) {
            if (subjects[i] == null) break;
            if (subjects[i].discipline.equals(dis)) {
                subjects[i].setScore(score);
                score.setSubject(subjects[i]);
                break;
            }
        }
    }
    public Score[] getAllScore (Discipline [] dis){
        Score[]listOfScore = new Score[dis.length];
        for (int i =0; i<dis.length; i++){
            if (dis[i]==null) break;
            listOfScore[i] = getScore(dis[i]);
                   }
        return listOfScore;
    }

        Score getScore (Discipline dis) {
            Score m = null;
            for (int i = 0; i < discipline.length; i++) {
                if (subjects[i] == null) break;
                if (subjects[i].discipline.equals(dis)) {
                    m = subjects[i].getScore();
                    break;
                }

            }
            return m;
        }



     boolean consist(Discipline any){

        for (int i=0; i<discipline.length; i++){
            if (discipline[i]!=null){
                if (discipline[i]==any)return true;
            }
        }
        return false;
    }

     String listOfDiscipline (){
         StringBuilder sb = new StringBuilder();
          for (int i=0; i<discipline.length; i++){
               if (discipline[i]==null)
                   break;
                sb.append(discipline[i]).append("\n");
                        }
          return "Student " + getName()+" " +getLastName()+ ". List of discipline: \n"+sb;
    }

    public String listOfScores (Score[]score){
        StringBuilder list = new StringBuilder();

        for (int i = 0; i < score.length; i++) {
            if (score[i] == null) break;
            list.append(score[i].getSubject().nameOfSubject()).append(" - ").append(score[i].getValue()).append("\n");
        }
        return "List os scores of "+getName() +" " +getLastName()+":\n"+list;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Discipline[] getDiscipline() {
        return discipline;
    }

    public void setDisciplins(Discipline[] disciplins) {
        this.discipline = disciplins;
    }

    public String toString (){
        return getName() + " " + getLastName();
    }
}
