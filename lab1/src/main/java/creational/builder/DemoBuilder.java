package creational.builder;

public class DemoBuilder {

    public static void main(String[] args) {
        BeverageNutritionLabel ingredients = new BeverageNutritionLabel.Builder(100)
                .calories(15)
                .carbohydrates(20)
                .protein(5)
                .potassium(25)
                .build();

        System.out.println(ingredients.toString());
    }

}
