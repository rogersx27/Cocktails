package test;

import classes.childrens.JuiceCocktail;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuiceCocktailTest {

    @Test
    public void testCalculateSaleCostWithThreeDaysRemaining() {
        JuiceCocktail mojito = new JuiceCocktail(
                "Mojito",
                7.5,
                "Refreshing cocktail with mint and lime",
                "Cuba",
                5,
                true,
                5,
                "Green",
                3
        );
        double cost = mojito.calculateSaleCost(10, 3);
        assertEquals(73.5, cost, 0.01);
    }

    @Test
    public void testCalculateSaleCostWithTwoDaysRemaining() {
        JuiceCocktail mojito = new JuiceCocktail(
                "Mojito",
                7.5,
                "Refreshing cocktail with mint and lime",
                "Cuba",
                5,
                true,
                5,
                "Green",
                3
        );
        double cost = mojito.calculateSaleCost(10, 2);
        assertEquals(72.75, cost, 0.01);
    }

    @Test
    public void testCalculateSaleCostWithOneDayRemaining() {
        JuiceCocktail mojito = new JuiceCocktail(
                "Mojito",
                7.5,
                "Refreshing cocktail with mint and lime",
                "Cuba",
                5,
                true,
                5,
                "Green",
                3
        );
        double cost = mojito.calculateSaleCost(10, 1);
        assertEquals(71.25, cost, 0.01);
    }

    @Test
    public void testInvalidNameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new JuiceCocktail("Mojito123", 7.5, "Refreshing cocktail", "Cuba", 5, true, 5, "Green", 3);
        });
        assertEquals("The cocktail name must contain only letters and spaces.", exception.getMessage());
    }

    @Test
    public void testInvalidPriceThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new JuiceCocktail("Mojito", -7.5, "Refreshing cocktail", "Cuba", 5, true, 5, "Green", 3);
        });
        assertEquals("The price must be a positive number.", exception.getMessage());
    }
}
