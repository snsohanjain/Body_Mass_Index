public class BmiCalculator {

    private double height;
    private double weight;
    private int age;

    public BmiCalculator(double height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public double calculateBmi(){
        double heightInMeter = height / 100;
        double heightSquare = heightInMeter * heightInMeter;

        short bmi = (short) (weight / heightSquare);
        return  bmi;
    }


    @Override
    public String toString() {
        return "BmiCalculator{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
