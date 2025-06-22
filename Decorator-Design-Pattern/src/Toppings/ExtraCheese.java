package Toppings;

import Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza=pizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+50;
    }
}
