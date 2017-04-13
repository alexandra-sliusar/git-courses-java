package ua.course.java;

public class Model {
	String value = "";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void addValue(String value) {
		this.value += value;
	}
}
