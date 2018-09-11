
public class Main {

    public static void main(String[] args) throws NumberFormatException {
        // write your code here

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            System.out.println(args[0] + args[1] + args[2] + " = " +
                    (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
        } catch (Exception e) {
            System.out.println("wrong input: " + e.getMessage().substring(
                    e.getMessage().indexOf("\"") + 1, e.getMessage().indexOf("\"",
                            e.getMessage().indexOf("\"")+1)
            ));
        }



    }
}
