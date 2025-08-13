package level1;


public class MestrePizzer {
    private PizzaBuilder builder;

    public MestrePizzer(PizzaBuilder builder) {


        this.builder = builder;
    }

    public Pizza makePizza(String size, String dough, java.util.List<String> toppings) {
        builder.setSize(size);
        builder.setDough(dough);
        builder.setToppings(toppings);
        return builder.build();
    }
}