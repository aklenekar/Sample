package enumDemo;

import java.time.LocalDateTime;

public class User {

	private int id;
	private String name;
	private LocalDateTime date = LocalDateTime.now();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String toString() {
		return this.id + "       " + this.name + "       " + this.date;
	}
}
