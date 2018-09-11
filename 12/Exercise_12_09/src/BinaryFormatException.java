public class BinaryFormatException extends Exception {

    public BinaryFormatException(String s) {
        super("Wrong binary number: " + s);
    }

}
