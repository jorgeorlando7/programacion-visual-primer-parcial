import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class NextMonth{

    public static void main (String []args)     {
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: "+c1.getTime().toLocaleString());
        c1.set(2000, Calendar.AUGUST, 31);
        System.out.println("Fecha 31 Agosto 2000: "+c1.getTime().toLocaleString());
        c1.set(Calendar.MONTH, 13);
        System.out.println("Fecha 13 meses más: "+c1.getTime().toLocaleString());
        c1.set(2000, Calendar.AUGUST, 31);
        c1.add(Calendar.MONTH, 13);
        System.out.println("Fecha 13 meses más: "+c1.getTime().toLocaleString());
        c1.roll(Calendar.HOUR, 25);
        System.out.println("Fecha 25 horas más: "+c1.getTime().toLocaleString());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        System.out.println("Fecha Formateada: "+sdf.format(c1.getTime()));

    }

}