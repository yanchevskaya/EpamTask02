import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Lisica on 24.01.2017.
 */
public class CrazyLogger {
    public static Calendar calendar = Calendar.getInstance();
    StringBuilder logger = new StringBuilder();

    public void add(String message){
        Formatter formatter = new Formatter();
        formatter.format("%td-%tm-%tY : %tH-%tM - %s", calendar, calendar, calendar, calendar, calendar, message);
        logger.append(formatter+"\n");

    }

    public void add2(String message){

        ZonedDateTime now = ZonedDateTime.now();

        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyy : HH-mm", new Locale("ru"));

        logger.append(now.format(formatted)).append(" - "+message+"\n");

    }





    public String find(String s) {
        int x=-1;

           x = logger.indexOf(s);

        if (x>=0) {
            return logger.substring(x, x + s.length());
        }
        return "No word";
    }

}

