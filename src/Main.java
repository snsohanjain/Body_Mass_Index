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

        List<Double> averageBmi = new ArrayList<>();
        List<Integer> averageAge = new ArrayList<>();

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
//                System.out.println(bmiCalculator.calculateBmi());
                averageBmi.add(bmiCalculator.calculateBmi());
                averageAge.add(bmiCalculator.averageAge());
                
            }
//            System.out.println("Looping Through the user");
            users.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // For calculate for the average Bmi
        float bmi = 0;
        for(double i = 0; i < averageBmi.size(); i++){
            bmi  += averageBmi.get((int) i);
        }
        float avgBmi =  (bmi / averageBmi.size());
        System.out.println("averageBmi: " + avgBmi);

        int totalAge = 0;
        for(int i = 0; i < averageAge.size(); i++){
            totalAge += averageAge.get(i);
        }
        int avgAge = totalAge / averageAge.size();
        if(avgAge > 0 && avgAge <= 4.9){
            System.out.println("ageGroup: 0-4.9");
        }else if(avgAge >= 5 && avgAge<= 9.9){
            System.out.println("ageGroup: 5-9.9");
        }else if(avgAge >= 10 && avgAge<= 14.9){
            System.out.println("ageGroup: 10-14.9");
        }else if(avgAge >= 15 && avgAge<= 19.9){
            System.out.println("ageGroup: 15-19.9");
        }else if(avgAge >= 20 && avgAge<= 24.9){
            System.out.println("ageGroup: 20-24.9");
        }else if(avgAge >= 25 && avgAge<= 29.9){
            System.out.println("ageGroup: 25-29.9");
        }else if(avgAge >= 30 && avgAge<= 34.9){
            System.out.println("ageGroup: 30-34.9");
        }else if(avgAge >= 35 && avgAge<= 39.9){
            System.out.println("ageGroup: 35-39.9");
        }else if(avgAge >= 40 && avgAge<= 44.9){
            System.out.println("ageGroup: 40-44.9");
        }else if(avgAge >= 50 && avgAge<= 54.9){
            System.out.println("ageGroup: 50-54.9");
        }else if(avgAge >= 60 && avgAge<= 64.9){
            System.out.println("ageGroup: 60-64.9");
        }else if(avgAge >= 65 && avgAge<= 69.9){
            System.out.println("ageGroup: 65-69.9");
        }else if(avgAge >= 70 && avgAge<= 74.9){
            System.out.println("ageGroup: 70-74.9");
        }else if(avgAge >= 75 && avgAge<= 79.9){
            System.out.println("ageGroup: 75-79.9");
        }else if(avgAge >= 80 && avgAge<= 89.9){
            System.out.println("ageGroup: 80-89.9");
        }else if(avgAge >= 90 && avgAge<= 94.9){
            System.out.println("ageGroup: 90-94.9");
        }else if(avgAge >= 95 && avgAge<= 99.9){
            System.out.println("ageGroup: 95-99.9");
        }

    }
}