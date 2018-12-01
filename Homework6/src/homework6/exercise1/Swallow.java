/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6.exercise1;

/**
 *
 * @author Taras
 */
public class Swallow extends FlyingBird{

    public Swallow(boolean layEggs, String feathers, String name) {
        super(layEggs, feathers);
        setName(name);
    }

    @Override
    public String fly() {
        return super.fly() + getName();        
    }
}
