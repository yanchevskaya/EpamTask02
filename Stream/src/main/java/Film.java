import java.io.Serializable;

/**
 * Created by Lizhen on 31.01.2017.
 */
public class Film implements Serializable{
    private String name;
    private Actor [] mainActors;

    Film (int amountOfActors, String name){
        this.name = name;
        mainActors = new Actor[amountOfActors];
    }

    public void add(Actor actor) {
        if (mainActors[mainActors.length - 1] != null) {
            System.out.println("You can't add someone else");

        } else for (int i = 0; i < mainActors.length; i++) {
            if (mainActors[i] == null) {
                mainActors[i] = actor;
                break;
               }

        }
    }

    public String getName() {
        return name;
    }

    public String listOfActors() {
        StringBuilder s = new StringBuilder();
        for  (int i=0; i<mainActors.length; i++) {
            if (mainActors[i]==null) break;
            s.append(mainActors[i].toString()+"\n");
        }
        return s.toString();
    }

    @Override
    public String toString(){
        return "Film's name: \"" +getName() + "\";\nList of actors: " + listOfActors();

        }

    }


