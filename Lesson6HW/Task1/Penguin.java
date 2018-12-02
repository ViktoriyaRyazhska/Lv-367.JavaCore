package homeworkl6;

public class Penguin extends NonFlyingBird{
	private String kind="Penguin";
	@Override
	public void fly() {
		setSpeedOfrun(7);
		setFeathers("Realy small black with white feathers");
		setLayEggs("Can lay eggs");
		
	}
	@Override
	public String toString() {
		return "Penguin kind of penguin = " + kind + ", SpeedOfrun = " + getSpeedOfrun() + ", Feathers  = " + getFeathers()
				+ ", LayEggs = " + getLayEggs() + ";";
	}

}
