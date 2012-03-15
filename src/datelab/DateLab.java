/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datelab;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author jbaldwin2
 */
public class DateLab {

    /**
     * @param args the command line arguments
     */
    public static final long DAY_UNITS = 1000L * 60L * 60L * 24L;

    public static int dateDiff(long dateUtilitiesUnitField, Calendar firstDate, Calendar secondDate)
            throws IllegalArgumentException {
        long diff = Math.abs(firstDate.getTimeInMillis() - secondDate.getTimeInMillis());
        double diffAmt = (double) diff / dateUtilitiesUnitField;

        return (int) Math.round(diffAmt);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Lab Activity 1
        Date d = new Date();
        String f = "MM/dd/yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(f);
        String fDate = sdf.format(d);
        System.out.println("Exercise one output: " + fDate);

        // Lab Activity 2
        Calendar c = Calendar.getInstance();
        d = c.getTime();
        fDate = sdf.format(d);
        System.out.println("Exercise two output: " + fDate);

        //Lab Activity 3
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d2.add(Calendar.DATE, -7);
        int difference = dateDiff(DAY_UNITS, d1, d2);
        System.out.println("Exercise 3 output: " + difference);


        //Lab Activity 4
        c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        d = c.getTime();
        fDate = sdf.format(d);
        System.out.println("Exercise 4 output: Invoice due-" + fDate);

        //Lab Activity 5
        String date = "03/14/2012";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date cDate = formatter.parse(date);

            System.out.println("Exercise 5 output: " + formatter.format(cDate));
        } catch (ParseException e) {
            System.out.println("Exception :" + e);
        }


    }
}
