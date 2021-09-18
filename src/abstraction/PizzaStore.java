package abstraction;

public class PizzaStore {

    public void orderPizza(Pizza pizza){
        System.out.println(pizza.getName());
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.box();
    }
}
