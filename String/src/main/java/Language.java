import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Created by Lisica on 24.01.2017.
 */
public class Language {
    Internationalization choice;
    BufferedReader reader;

   public String chooseLanguage(String lang) throws IOException {

       if (lang.equals("en")) {
           System.out.println("Choose the number of question which answer you want to know:\n" +
                   "1. Clean, but not water. White, but not snow. Sweet, but not ice-cream\n" +
                   "2. What occurs once in a minute, twice in a moment and never in a thousand years?\n" +
                   "3. What is found over your head but under your hat?\n" +
                   "4. The more you have of it, the less you see. What is it?\n" +
                   "5. What's black when you get it, red when you use it, and white when you're all through with it?");
           reader = new BufferedReader(new InputStreamReader(System.in));
           int number = Integer.parseInt(reader.readLine());
             if (number>=1&&number<=5) {
                return englishLocale(Integer.toString(number));
            } else return "non correct number";

       } else if ((lang.equals("ru"))) {
           System.out.println("Выбери номер вопроса, ответ на который ты хочешь знать \n" +
                   "1. Чист, но не вода. Бел, но не снегю. Сладок, но не мороженое\n" +
                   "2. Что бывает один раз в минуте, два раза в моменте, и никогда в тысяче лет?\n" +
                   "3. Что находится над головой, но под шляпой?\n" +
                   "4. Чем больше этого есть, тем меньше ты видишь. Что это?\n" +
                   "5. Что черное, когда ты его получаешь, красное, когда используешь и белое после?");
           reader = new BufferedReader(new InputStreamReader(System.in));
           int number = Integer.parseInt(reader.readLine());

           if (number>=1 && number<=5) {
               return russianLocale(Integer.toString(number));
           }
           else return "Не верный ввод";
       }

       else return "Non correct!";
   }

           private String englishLocale(String number){
           choice = new Internationalization(new Locale("en"));
          return choice.getAnswer(number);

       }

    private String russianLocale(String number){
        choice = new Internationalization(new Locale("ru"));
        return choice.getAnswer(number);
   }

   }
