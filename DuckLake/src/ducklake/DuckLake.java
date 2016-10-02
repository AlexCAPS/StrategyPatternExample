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
public class DuckLake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MallardDuck mallardDuck = new MallardDuck();
        
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        
        ModelDuck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}
