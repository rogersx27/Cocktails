package classes.childrens;

import classes.Cocktail;

public class AlcoholShot extends Cocktail {
    private String type;

    public AlcoholShot(String name, double unitPrice, String description, String origin, int alcoholContent, boolean isPopular, int ingredientCount, String color, String type) {
        super(name, unitPrice, description, origin, alcoholContent, isPopular, ingredientCount, color);
        if (!type.matches("Premium|Base")) {
            throw new IllegalArgumentException("The type must be 'Premium' or 'Base'.");
        }
        this.type = type;
    }

    @Override
    public double calculateSaleCost(int quantity, int daysRemaining) {
        return quantity * getUnitPrice();
    }
}

