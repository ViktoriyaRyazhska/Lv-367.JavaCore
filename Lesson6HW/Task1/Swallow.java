package homeworkl6;

public class Swallow extends FlyingBird{
	private String kind="Swallow";
	@Override
	public void fly() {
		setHighOfFly(50.5);
		setSpeedOfFly(20.5);
		setFeathers("Big white feathers");
		setLayEggs("Can lay eggs");
	}

	@Override
	public String toString() {
		return "Swallow High Of Fly = " + getHighOfFly() + ", SpeedOfFly = " + getSpeedOfFly() + ", Feathers = "
				+ getFeathers() + ", LayEggs = " + getLayEggs() + ", kind of bird = " + kind;
	}

	
}
