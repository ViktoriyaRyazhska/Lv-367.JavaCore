package homeworkl6;

public class Eagle extends FlyingBird {
	private String kind="Eagle";
	@Override
	public void fly() {
		setHighOfFly(60.5);
		setSpeedOfFly(30.5);
		setFeathers("Big broun feathers");
		setLayEggs("Can lay eggs");
	}

	@Override
	public String toString() {
		return "Eagle High Of Fly = " + getHighOfFly() + ", SpeedOfFly = " + getSpeedOfFly() + ", Feathers = "
				+ getFeathers() + ", LayEggs = " + getLayEggs() + ", kind of bird = " + kind;
	}

	
	
}
