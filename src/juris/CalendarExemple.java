package juris;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExemple {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");


 void printDate(){
     System.out.println("Tagad ir : "+ dateFormat.format(calendar.getTime()));
 }
}
