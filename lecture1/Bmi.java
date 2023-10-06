public class Bmi {
    public static void printRisk(int age, double h, double w) {
        double height = h / 100;
        double bmi = w / ( height * height );
        
        System.out.println("Your BMI:"+ bmi);

        if (age < 45 && bmi < 22){
            System.out.println("Your risk: Low");
        }else if (age >= 45 && bmi >= 22){
            System.out.println("Your risk: High");
        }else{
            System.out.println("Your risk: Medium");
        }
    }

    public static void main(String[] args) {
        int age = 30;
        double h = 170.0;
        double w = 70.0;

        printRisk(age, h, w);
    }
}
