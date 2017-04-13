
public class Day {
	private int day;

	Day() {
		day = 1;
	}

	Day(int val, int range) {
		if (val > 0 && val <= range) {
			day = val;
		} else {
			day = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Day other = (Day) obj;
		if (this.getDay() != other.getDay())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return day + " ";
	}

}
