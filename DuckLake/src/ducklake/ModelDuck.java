/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducklake;

/**
 *
 * @author alex
 */
public class ModelDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
    
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
}
