
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year date1 = new Year(11, 8, 1996);
		Year date2 = new Year("11.8.1996");
		Year date3 = new Year(12, 5, 2000);
		System.out.println(date1 + " hashcode: " + date1.hashCode());
		System.out.println(date2 + " hashcode: " + date2.hashCode());
		System.out.println(date3 + " hashcode: " + date3.hashCode());

		System.out.println(date2.countDifferenceInDates(date1));
		System.out.println(date2.countDifferenceInDates(date3));

		date2.setValues("12.4.2017");
		System.out.println(date2 + " hashcode: " + date2.hashCode());
		System.out.println(date2.countDifferenceInDates(date3));

		System.out.println(date1.getWeekDay());
		System.out.println(date2.getWeekDay());
	}

}
