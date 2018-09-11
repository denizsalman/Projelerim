import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar calendar;
        if (args.length == 2) {
            calendar = new GregorianCalendar(Integer.parseInt(args[1]),
                    Integer.parseInt(args[0]) - 1, 1);
        } else if (args.length == 1) {
            calendar = new GregorianCalendar(new GregorianCalendar().get(Calendar.YEAR),
                    Integer.parseInt(args[0]) - 1, 1);
        } else {
            calendar = new GregorianCalendar(new GregorianCalendar().get(Calendar.YEAR),
                    new GregorianCalendar().get(Calendar.MONTH), 1);
        }
        printHeader(calendar);
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("    ");
        }
        while (true) {
            System.out.printf("%4d", calendar.get(Calendar.DAY_OF_MONTH));
            if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.println();
            }
            if (calendar.get(Calendar.DAY_OF_MONTH) == calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
                break;
            calendar.add(Calendar.DATE, 1);
        }

    }

    private static void printHeader(Calendar calendar) {
        String[] months = {"Jun", "Feb", "Mar", "April", "May", "July", "June", "Augst", "Sep"
        , "Oct", "Nov", "Dec"};
        System.out.println(months[calendar.get(calendar.MONTH)] + ", " + calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
}
