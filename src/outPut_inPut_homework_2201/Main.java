package outPut_inPut_homework_2201;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        File file = new File("text.txt");
    System.out.println(countSum(file));
    }

    public static Integer countSum (File fileName) throws IOException {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line). append("");


            }
        }
     return Integer.parseInt (String.valueOf(sb.append("")));
    }
}
