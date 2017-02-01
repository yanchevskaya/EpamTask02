import java.io.Serializable;

/**
 * Created by Lizhen on 31.01.2017.
 */
public class CollectionOfFilms implements Serializable {
        private String collectionName;
        private Film[] films;

        CollectionOfFilms(int amountOfFilms, String collectionName) {
               this.collectionName = collectionName;
                films = new Film[amountOfFilms];
        }

        public void add(Film film) {
                if (films[films.length - 1] != null) {
                        System.out.println("You can't add someone else");

                } else for (int i =0; i<films.length; i++) {
                        if (films[i] == null) films[i] = film;
                        break;
                }
        }


    private String listOfFilms() {
        StringBuilder s = new StringBuilder();
        for (Film f : films) {
            s.append(f.toString()+"\n");
        }
        return s.toString();
    }

        @Override
        public String toString(){
                return "The name of Collection is "+getCollectionName() + ", amount of films - " + films.length +
                        "\n" + listOfFilms();

        }

        public String getCollectionName() {
                return collectionName;
        }
}
