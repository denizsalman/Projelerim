public class HexFormatException extends Exception{

    public HexFormatException(String s) {
        super("String is not a hex: "+ "\"" + s + "\"");
    }
}
