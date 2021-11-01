package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data Brasileira: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data semo dia descrito: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data Média 1: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data Curta 2: " + dateFormat.format(date));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Data formatada: " + simpleDateFormat.format(date));
    }
}
