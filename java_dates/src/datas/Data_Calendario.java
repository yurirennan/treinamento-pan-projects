package datas;

import java.util.Calendar;

public class Data_Calendario {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = (Calendar) Calendar.getInstance();
        Calendar calendario3 = (Calendar) Calendar.getInstance();

        System.out.println("Calendario 1 antes" + calendario1.getTime());
        System.out.println("Calendario 2 antes" + calendario2.getTime());
        System.out.println("Calendario 3 antes" + calendario3.getTime());
        System.out.println("---------------------------");

        calendario1.add((Calendar.MONTH), 2);
        calendario2.add((Calendar.YEAR), 5);
        calendario3.add((Calendar.DAY_OF_MONTH), 10);

    }
}
