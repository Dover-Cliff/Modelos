package Duck;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings(); 
        quackBehavior = new Quack();     
    }

    @Override
    public void display() {
        System.out.println("Soy un pato Mallard.");
    }
}
