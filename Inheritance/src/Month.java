
public class Month {
	private int month;

	Month() {
		month = 1;
	}

	Month(int m) {
		if (m > 0 && m <= 12) {
			month = m;
		} else
			month = 1;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getNumberOfDays() {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			return 31;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			return 30;
		}

		case 2: {
			return 28;
		}
		}
		return 30;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 100;
		result = prime * result + month;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		if (this.getMonth() != other.getMonth())
			return false;
		return true;
	}

	@Override
	public String toString() {
		Months[] months = Months.values();
		for (Months m : months) {
			if ((m.ordinal() + 1) == getMonth())
				return m.toString() + " ";
		}
		return (month + " ");
	}

}

enum Months {
	Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
}
