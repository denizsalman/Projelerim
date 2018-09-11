import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File file = new File("hangman.txt");
        ArrayList<String> list = new ArrayList<>();
        if (!file.exists())
            throw new FileNotFoundException();
        try (
                Scanner input = new Scanner(file);
                )
        {
            while (input.hasNext()) {
                list.add(input.next());
            }
        }

        String word = getRandomWord(list);
        System.out.println(word);
        start(word);

    }

    private static void start(String word) {
        Scanner input = new Scanner(System.in);
        String encryptWord = encrypt(word);
        while (!word.equals(encryptWord)) {
            System.out.print("(Guess) Enter a letter in word " + encryptWord + " ");
            String letter = input.next();
            System.out.print(encryptWord.contains(letter) ? (
                    letter + " is already in the word\n"): "");
            System.out.print(word.contains(letter) ?  "" : (letter + " not in the word\n"));
            encryptWord = decode(word, encryptWord, letter);
            System.out.println();
        }

        System.out.print("(Guess) Enter a letter in word " + encryptWord);
    }


    private static String decode(String word, String encryptWord, String letter) {
        StringBuilder stringBuilder = new StringBuilder(encryptWord);
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) + "").equals(letter)) {
                stringBuilder.replace(i, i + 1, letter);
            }
        }
        encryptWord = stringBuilder.toString();
        return encryptWord;
    }

    private static String encrypt(String word) {
        String encryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            encryptedWord += "*";
        }
        return encryptedWord;
    }

    private static String getRandomWord(ArrayList<String> list) {
        return list.get((int) (Math.random() * list.size()));
    }


}
