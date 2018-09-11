import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> ranks = new ArrayList<>();
        ArrayList<Double> salaries = new ArrayList<>();
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
               input.next(); input.next();
               ranks.add(input.next());
               salaries.add(Double.parseDouble(input.next()));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double totalAssistantSalary = 0;
        int AssistantNumber = 0;
        double totalAssociateSalary = 0;
        int AssociateNumber = 0;
        double totalFullSalary = 0;
        int FullNumber = 0;
        for (int i = 0; i < ranks.size(); i++) {
            if (ranks.get(i).equals("assistant")) {
                totalAssistantSalary += salaries.get(i);
                AssistantNumber++;
            } else if (ranks.get(i).equals("associate")) {
                totalAssociateSalary += salaries.get(i);
                AssociateNumber++;
            } else {
                totalFullSalary += salaries.get(i);
                FullNumber++;
            }
        }

        System.out.println("Total assistant salary: " + String.format("%f", totalAssistantSalary));
        System.out.println("Total associate salary: " + String.format("%f",totalAssociateSalary));
        System.out.println("Total full salary: " + String.format("%f", totalFullSalary));
        System.out.println("Total salary: " + (totalAssistantSalary +
                totalAssociateSalary + totalFullSalary));
        System.out.println("Personel's number: " + ranks.size());
    }
}
