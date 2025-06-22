import Pizza.BasePizza;
import Pizza.MargheritaPizza;
import Toppings.ExtraCheese;
import Toppings.Mushroom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new MargheritaPizza());
        BasePizza pizza2 = new Mushroom(new ExtraCheese(new MargheritaPizza()));

        System.out.println(pizza2.cost());
        System.out.println(pizza1.cost());
    }
}