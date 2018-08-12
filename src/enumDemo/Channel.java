package enumDemo;

public enum Channel {

	DISPLAY(0), VIDEO(1), AUDIO(2), UNKNOWN(-1);

	private int id;

	private Channel(int id) {
		this.id = id;
	}

	public int ID() {
		return id;
	}

}
