public class BMIService {
    public enum BMIResult {
        SEVERE_THINNESS("SEVERE_THINNESS"),
        MODERATE_THINNESS("MODERATE_THINNESS"),
        MILD_THINNESS("MILD_THINNESS"),
        NORMAL("NORMAL"),
        OVERWEIGHT("OVERWEIGHT"),
        OBESE_CLASS_1("OBESE_CLASS_1"),
        OBESE_CLASS_2("OBESE_CLASS_2"),
        OBESE_CLASS_3("OBESE_CLASS_3");

        final private String title;

        BMIResult(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
    float calculate(float weightInKilograms, float heightInMetres) {
        return weightInKilograms / heightInMetres / heightInMetres;
    }

    BMIResult calculateStatus(float weightInKilograms, float heightInMetres) {
        float bmi = calculate(weightInKilograms, heightInMetres);
        if (bmi <= 16)
            return BMIResult.SEVERE_THINNESS;
        else if (bmi <= 17)
            return BMIResult.MODERATE_THINNESS;
        else if (bmi <= 18.5)
            return BMIResult.MILD_THINNESS;
        else if (bmi <= 25)
            return BMIResult.NORMAL;
        else if (bmi <= 30)
            return BMIResult.OVERWEIGHT;
        else if (bmi <= 35)
            return BMIResult.OBESE_CLASS_1;
        else if (bmi <= 40)
            return BMIResult.OBESE_CLASS_2;
        else
            return BMIResult.OBESE_CLASS_3;
    }
}
