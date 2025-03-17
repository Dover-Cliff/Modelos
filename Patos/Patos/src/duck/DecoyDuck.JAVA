package Duck;

import FlyBehavior.FlyNoWay;
import QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();   // No puede volar
        quackBehavior = new MuteQuack(); // No hace sonido
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de cebo.");
    }
}
