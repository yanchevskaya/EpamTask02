import java.io.Serializable;

/**
 * Created by Lizhen on 31.01.2017.
 */
public class Actor implements Serializable {
    private String name;
    private String lastname;

    Actor (String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return getName() +" "+ getLastname();
    }

    public String getLastname() {
        return lastname;
    }
}
