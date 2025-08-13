package level1;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public Pizza build() {
        if (toppings.isEmpty()) {
            toppings.add("pimiento");
            toppings.add("cebolla");
            toppings.add("aceitunas");
            toppings.add("queso");
        }
        return new Pizza(size, dough, toppings);
    }
}
