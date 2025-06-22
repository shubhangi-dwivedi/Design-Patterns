package Toppings;

import Pizza.BasePizza;

public class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza pizza){
        this.basePizza=pizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+30;
    }
}
