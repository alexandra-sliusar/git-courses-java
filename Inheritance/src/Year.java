public class Year {
	private int year;
	public Month month;
	public Day day;
	public boolean isLeapYear;

	Year() {
		year = 2000;
		month = new Month();
		day = new Day();
		ifLeapYear();
	}

	Year(int d, int m, int y) {
		setValues(d, m, y);
	}

	Year(String s) {
		setValues(s);
	}

	public int getYear() {
		return year;
	}

	public void setValues(int d, int m, int y) {
		if (y > 0) {
			year = y;
		} else
			year = 1;
		ifLeapYear();
		month = new Month(m);
		if (month.getMonth() == 2 && isLeapYear)
			day = new Day(d, month.getNumberOfDays() + 1);
		else
			day = new Day(d, month.getNumberOfDays());
	}

	public void setValues(String s) {
		String[] date = s.split("\\.");
		setValues(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
	}

	public void ifLeapYear() {
		isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	public String countDifferenceInDates(Year other) {
		int days = 0, months = 0;
		if (this.getYear() > other.getYear()) {
			if (this.month.getMonth() < other.month.getMonth()) {
				months = 12 * (getYear() - other.getYear() - 1) + (12 - other.month.getMonth() + month.getMonth());
				if (this.day.getDay() <= other.day.getDay()) {
					days = other.month.getNumberOfDays() - other.day.getDay() + day.getDay();
					months = months - 1;
				} else {
					days = day.getDay() - other.day.getDay();
				}
			} else {
				if (this.day.getDay() <= other.day.getDay()) {
					months = 12 * (this.getYear() - other.getYear() - 1)
							+ (12 - other.month.getMonth() + month.getMonth() - 1);
					days = other.month.getNumberOfDays() - other.day.getDay() + day.getDay();
				} else {
					months = 12 * (this.getYear() - other.getYear() - 1)
							+ (12 - other.month.getMonth() + month.getMonth());
					days = day.getDay() - other.day.getDay();
				}
			}
		} else {
			if (this.getYear() < other.getYear()) {
				//
				if (other.month.getMonth() < month.getMonth()) {
					months = 12 * (other.getYear() - getYear() - 1) + (12 - month.getMonth() + other.month.getMonth());
					if (other.day.getDay() <= day.getDay()) {
						days = month.getNumberOfDays() - day.getDay() + other.day.getDay();
						months = months - 1;
					} else {
						days = other.day.getDay() - day.getDay();
					}
				} else {
					if (other.day.getDay() <= this.day.getDay()) {
						months = 12 * (other.getYear() - getYear() - 1)
								+ (12 - month.getMonth() + other.month.getMonth() - 1);
						days = month.getNumberOfDays() - day.getDay() + other.day.getDay();
					} else {
						months = 12 * (other.getYear() - getYear() - 1)
								+ (12 - month.getMonth() + other.month.getMonth());
						days = other.day.getDay() - day.getDay();
					}
				}
			} else {

				if (other.month.getMonth() < month.getMonth()) {

					if (other.day.getDay() <= day.getDay()) {
						months = month.getMonth() - other.month.getMonth();
						days = day.getDay() - other.day.getDay();
					} else {
						months = month.getMonth() - other.month.getMonth() - 1;
						days = (new Month(month.getMonth() - 1)).getNumberOfDays() - other.day.getDay() + day.getDay();
					}
				} else {
					if (other.day.getDay() <= this.day.getDay()) {
						months = other.month.getMonth() - month.getMonth();
						days = day.getDay() - other.day.getDay();
					} else {
						months = other.month.getMonth() - month.getMonth();
						days = other.day.getDay() - day.getDay();
					}

				}

			}
		}
		return "Difference between " + this + " and " + other + ": " + months + " months " + days + " days.";
	}

	public String getWeekDay() {
		int[] monthMove = { 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		String[] namesOfWeekDays = { "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday" };
		Year monday = new Year("1.1.1920");
		int daysBetweenYears = 0;
		if (monday.getYear() < getYear()) {
			int i = monday.getYear();
			while (i != getYear()) {
				if (new Year(1, 1, i).isLeapYear)
					daysBetweenYears += 366;
				else
					daysBetweenYears += 365;
				i++;
			}
			int numberOfDay = ((daysBetweenYears % 7) + monthMove[month.getMonth() - 1] + day.getDay()) % 7;
			return "Day of week of " + this + ": " + namesOfWeekDays[numberOfDay];
		} else {
			return "Too early";
		}

	}

	@Override
	public int hashCode() {
		final int prime = 27;
		int result = 1000;
		result += ((day == null) ? 0 : day.hashCode());
		result += ((month == null) ? 0 : month.hashCode());
		result += prime + result * year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Year other = (Year) obj;
		if (this.getYear() != other.getYear() || !this.month.equals(other.month) || !this.day.equals(other.day))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return day.toString() + month.toString() + year;
	}

}
