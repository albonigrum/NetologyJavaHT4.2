public class Main {
    public static void main(String[] args) {
        BMIService bmiService = new BMIService();
        int weight, height;
        weight = 90;
        height = 190;
        System.out.println(bmiService.calculate(weight, height));
    }
}
