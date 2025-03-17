/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyBehavior;

/**
 *
 * @author estudiantes
 */
public abstract class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("No vuela :c");
    }
}
