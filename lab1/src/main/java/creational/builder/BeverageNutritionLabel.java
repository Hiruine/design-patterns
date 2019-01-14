package creational.builder;

public class BeverageNutritionLabel {

    private final double water;
    private final double calories;
    private final double fat;
    private final double potassium;
    private final double carbohydrates;
    private final double cholesterol;
    private final double protein;

    public static class Builder {

        private final double water;

        private double calories = 0.0;
        private double fat = 0.0;
        private double potassium = 0.0;
        private double carbohydrates = 0.0;
        private double cholesterol = 0.0;
        private double protein = 0.0;

        public Builder(double water) {
            this.water = water;
        }

        public Builder calories(double calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(double fat) {
            this.fat = fat;
            return this;
        }

        public Builder potassium(double potassium) {
            this.potassium = potassium;
            return this;
        }

        public Builder carbohydrates(double carbohydrates) {
            this.carbohydrates = carbohydrates;
            return this;
        }

        public Builder cholesterol(double cholesterol) {
            this.cholesterol = cholesterol;
            return this;
        }

        public Builder protein(double protein) {
            this.protein = protein;
            return this;
        }

        BeverageNutritionLabel build() {
            return new BeverageNutritionLabel(this);
        }
    }

    private BeverageNutritionLabel(Builder builder) {
        this.water = builder.water;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.potassium = builder.potassium;
        this.carbohydrates = builder.carbohydrates;
        this.cholesterol = builder.cholesterol;
        this.protein = builder.protein;
    }

    public double getWater() {
        return water;
    }

    public double getCalories() {
        return calories;
    }

    public double getFat() {
        return fat;
    }

    public double getPotassium() {
        return potassium;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getProtein() {
        return protein;
    }

    @Override
    public String toString() {
        return "BeverageNutritionLabel{" +
                "water=" + water +
                ", calories=" + calories +
                ", fat=" + fat +
                ", potassium=" + potassium +
                ", carbohydrates=" + carbohydrates +
                ", cholesterol=" + cholesterol +
                ", protein=" + protein +
                '}';
    }
}
