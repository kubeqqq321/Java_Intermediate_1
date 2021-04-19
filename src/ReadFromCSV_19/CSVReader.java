package ReadFromCSV_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jakub Marciniak
 * #19
 */

public class CSVReader {
    public static void main(String[] args) {

        String path = "D:/IntelliJ IDEA/IntelliJ IDEA Community Edition 2020.3.1/Java_Intermediate_1/SacramentocrimeJanuary2006.csv";
        String line = "";


        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                System.out.println("Date: " + values[0] + ", Crime description: " + values[5]);

//                System.out.println(values[3]);
//                System.out.println(line);
//                break;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
