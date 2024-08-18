package classes.childrens;

import classes.Cocktail;

public class JuiceCocktail extends Cocktail {
    private int expirationDay;

    public JuiceCocktail(String name, double unitPrice, String description, String origin, int alcoholContent, boolean isPopular, int ingredientCount, String color, int expirationDay) {
        super(name, unitPrice, description, origin, alcoholContent, isPopular, ingredientCount, color);
        this.expirationDay = expirationDay;
    }

    @Override
    public double calculateSaleCost(int quantity, int daysRemaining) {
        double discount = 0.0;
        if (daysRemaining == 3) {
            discount = 0.02;
        } else if (daysRemaining == 2) {
            discount = 0.035;
        } else if (daysRemaining == 1) {
            discount = 0.05;
        }
        return quantity * getUnitPrice() * (1 - discount);
    }
}
