
package Duck;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

/**
 *
 * @author estudiantes
 */
public abstract class  Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {}
    
    public abstract void display();
    
    public void PerformFly(){
        flyBehavior.fly();
    }
        
    public void PerformQuack(){
        quackBehavior.hacerSonido();
    }
     public void swim(){
         System.out.println("Todos las patos flotan :0");
    }
}  


