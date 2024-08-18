import classes.childrens.AlcoholShot;
import classes.childrens.JuiceCocktail;

public class Main {

    public static void main(String[] args) {
        // Creating instances of JuiceCocktail and AlcoholShot
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

        // Calcula el costo de venta de JuiceCocktail con 3 días restantes
        double mojitoCost = mojito.calculateSaleCost(10, 3);
        System.out.println("Mojito sale cost for 10 units with 3 days remaining: $" + mojitoCost);

        // Calcula el costo de venta de AlcoholShot
        double tequilaShotCost = tequilaShot.calculateSaleCost(5, 0);
        System.out.println("Tequila Shot sale cost for 5 units: $" + tequilaShotCost);
    }
}