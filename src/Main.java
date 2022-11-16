import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int height ;
        int weight;
        int age;

        //File Reader --> Method for User class
        String fileName = "src/data.csv";
        File file = new File(fileName);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = "";
            List<BmiCalculator> users = new ArrayList<>();

            //This Will Execute the file reader to the user class
            while ((line = reader.readLine()) != null){
                String [] split = line.split(",");
                height = Integer.parseInt(split[0]);
                weight = Integer.parseInt(split[1]);
                age = Integer.parseInt(split[2]);
                BmiCalculator bmiCalculator = new BmiCalculator(height,weight,age);
                users.add(bmiCalculator);
                System.out.println(bmiCalculator.calculateBmi());
                
            }
            System.out.println("Looping Through the user");
            users.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}