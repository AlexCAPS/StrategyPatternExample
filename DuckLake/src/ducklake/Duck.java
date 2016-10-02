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
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
