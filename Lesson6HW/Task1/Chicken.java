package homeworkl6;

public class Chicken  extends NonFlyingBird {
	private String kind="Chicken";
	@Override
	public void fly() {
		setSpeedOfrun(5);
		setFeathers("Small random color feathers");
		setLayEggs("Can lay eggs");
		
	}
	@Override
	public String toString() {
		return "Chicken kind of chiken = " + kind + ", SpeedOfrun = " + getSpeedOfrun() + ", Feathers  = " + getFeathers()
				+ ", LayEggs = " + getLayEggs() + ";";
	}

}
