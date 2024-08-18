package classes;

public abstract class Cocktail {
    private String name;
    private double unitPrice;
    private String description;
    private String origin;
    private int alcoholContent;
    private boolean isPopular;
    private int ingredientCount;
    private String color;

    public Cocktail(String name, double unitPrice, String description, String origin, int alcoholContent, boolean isPopular, int ingredientCount, String color) {
        if (!name.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("The cocktail name must contain only letters and spaces.");
        }
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("The price must be a positive number.");
        }
        this.name = name;
        this.unitPrice = unitPrice;
        this.description = description;
        this.origin = origin;
        this.alcoholContent = alcoholContent;
        this.isPopular = isPopular;
        this.ingredientCount = ingredientCount;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public abstract double calculateSaleCost(int quantity, int daysRemaining);
}
