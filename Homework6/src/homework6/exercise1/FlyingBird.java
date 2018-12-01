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
public class FlyingBird extends Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlyingBird(boolean layEggs, String feathers) {
        setLayEggs(layEggs);
        setFeathers(feathers);
    }

    @Override
    public String fly() {
        return "I fly like ";
    }

    @Override
    public String toString() {
        return "Is FlyingBird{" + "name=" + getName() + ", feathers " + getFeathers() + ", layEggs " + isLayEggs() + "}";
    }
}
