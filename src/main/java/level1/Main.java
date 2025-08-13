package level1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        MestrePizzer mestre = new MestrePizzer(hawaiianBuilder);
        Pizza hawaiian = mestre.makePizza("Grande", "Fina", Arrays.asList("jamón", "piña", "queso extra"));
        System.out.println(hawaiian);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        mestre = new MestrePizzer(vegetarianBuilder);
        Pizza vegetarian = mestre.makePizza("Mediana", "Integral", Arrays.asList("pimiento", "cebolla", "aceitunas", "tomate"));
        System.out.println(vegetarian);
    }
}

