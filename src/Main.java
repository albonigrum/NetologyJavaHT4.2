public class Main {
    public static void main(String[] args) {
        BMIService bmiService = new BMIService();
        float weightInKilograms, heightInMetres;
        weightInKilograms = 85.3F;
        heightInMetres = 1.88F;
        System.out.println(bmiService.calculate(weightInKilograms, heightInMetres));
        System.out.println(bmiService.calculateStatus(weightInKilograms, heightInMetres));
    }
}
