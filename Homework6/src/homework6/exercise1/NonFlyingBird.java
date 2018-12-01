package homework6.exercise1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Taras
 */
public class NonFlyingBird extends Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NonFlyingBird(boolean layEggs, String feathers) {
        setLayEggs(layEggs);
        setFeathers(feathers);
    }

    @Override
    public String fly() {
        return "I fly like ";
    }

    @Override
    public String toString() {
        return "Is NonFlyingBird{" + "name=" + getName() + ", feathers " + getFeathers() + ", layEggs " + isLayEggs() + "}";
    }

}
