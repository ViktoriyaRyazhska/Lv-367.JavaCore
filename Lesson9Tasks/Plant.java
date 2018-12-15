package lesson9;

public class Plant {
	enum Color {
		Red, Blue, Yellow, Green
	}

	enum Type {
		Rose, Chamomile, Violet, Orchid
	}

	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) {
		Color c = null;
		try {
			c = colorStrToEnum(color);
		} catch (ColorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Type t = null;
		try {
			t = typeStrToEnum(type);
		} catch (TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.size = size;
		this.color = c;
		this.type = t;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant size = " + size + ", color=" + color + ", type=" + type + ";";
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "yellow":
			return Color.Yellow;
		case "green":
			return Color.Green;
		default:
			throw new ColorException("Input only color blue, red, yellow or green!");
		}

	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.Rose;
		case "chamomile":
			return Type.Chamomile;
		case "violet":
			return Type.Violet;
		case "orchid":
			return Type.Orchid;
		default:
			throw new TypeException("Input only type!");
		}
	}
}
