package level1;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {
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
            toppings.add("jamón");
            toppings.add("piña");
            toppings.add("queso");
        }
        return new Pizza(size, dough, toppings);
    }
}
