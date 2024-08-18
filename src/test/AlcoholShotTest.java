package test;

import classes.childrens.AlcoholShot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlcoholShotTest {

    @Test
    public void testCalculateSaleCost() {
        AlcoholShot tequilaShot = new AlcoholShot(
                "Tequila Shot",
                3.0,
                "Strong shot of pure tequila",
                "Mexico",
                40,
                true,
                1,
                "Clear",
                "Premium"
        );
        double cost = tequilaShot.calculateSaleCost(5, 0);
        assertEquals(15.0, cost, 0.01);
    }

    @Test
    public void testInvalidTypeThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new AlcoholShot("Tequila Shot", 3.0, "Strong shot", "Mexico", 40, true, 1, "Clear", "SuperPremium");
        });
        assertEquals("The type must be 'Premium' or 'Base'.", exception.getMessage());
    }

    @Test
    public void testInvalidNameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new AlcoholShot("Tequila123", 3.0, "Strong shot", "Mexico", 40, true, 1, "Clear", "Premium");
        });
        assertEquals("The cocktail name must contain only letters and spaces.", exception.getMessage());
    }

    @Test
    public void testInvalidPriceThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new AlcoholShot("Tequila Shot", -3.0, "Strong shot", "Mexico", 40, true, 1, "Clear", "Premium");
        });
        assertEquals("The price must be a positive number.", exception.getMessage());
    }
}
