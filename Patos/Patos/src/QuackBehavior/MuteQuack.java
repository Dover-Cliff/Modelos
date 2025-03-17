/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuackBehavior;

/**
 *
 * @author estudiantes
 */
public abstract class MuteQuack implements QuackBehavior{

  
    @Override
    public void hacerSonido() {
        System.out.println("No hace ruido :c");
    }

    
}
