/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();   // No puede volar
        quackBehavior = new Squeak();   // Hace squeak
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de goma.");
    }
}
