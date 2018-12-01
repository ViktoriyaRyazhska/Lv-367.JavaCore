package homework6.exercise1;


import homework6.exercise1.NonFlyingBird;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taras
 */
public class Chicken extends NonFlyingBird{

    public Chicken(boolean layEggs, String feathers, String name) {
        super(layEggs, feathers);
        setName(name);
    }

    @Override
    public String fly() {
        return super.fly() + getName();        
    }
}
