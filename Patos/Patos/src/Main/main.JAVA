import Duck.*;
import FlyBehavior.*;
import QuackBehavior.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los patos
        Duck mallard = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        // Comportamiento de MallardDuck
        System.out.println("Comportamiento de MallardDuck:");
        mallard.display();
        mallard.performFly();   // Mallard puede volar
        mallard.performQuack(); // Mallard hace cuac
        mallard.swim();         // Todos los patos flotan

        System.out.println();

        // Comportamiento de RubberDuck
        System.out.println("Comportamiento de RubberDuck:");
        rubberDuck.display();
        rubberDuck.performFly();   // RubberDuck no puede volar
        rubberDuck.performQuack(); // RubberDuck hace squeak
        rubberDuck.swim();         // Todos los patos flotan

        System.out.println();

        // Comportamiento de DecoyDuck
        System.out.println("Comportamiento de DecoyDuck:");
        decoyDuck.display();
        decoyDuck.performFly();   // DecoyDuck no puede volar
        decoyDuck.performQuack(); // DecoyDuck no hace sonido
        decoyDuck.swim();         // Todos los patos flotan
    }
}
