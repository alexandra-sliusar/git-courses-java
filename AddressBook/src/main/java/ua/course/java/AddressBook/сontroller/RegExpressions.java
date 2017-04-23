package ua.course.java.AddressBook.сontroller;

public interface RegExpressions {

	String REGEX_LASTNAME = "^[A-Z]{1}[a-z]{1,20}$";
	String REGEX_NAME = "^[A-Z]{1}[a-z]{1,15}$";
	String REGEX_PATRONYMIC = "^[A-Z]{1}[a-z]{1,25}$";
	String REGEX_NICKNAME = "^.{1,30}$";
	String REGEX_HOME_NUMBER = "^(\\+38)?(\\()?0[0-9]{2}(\\))?[0-9]{3}-?[0-9]{2}-?[0-9]{2}$";
	String REGEX_MOBILE_NUMBER = "^(\\+38)?(\\()?0[0-9]{2}(\\))?[0-9]{3}-?[0-9]{2}-?[0-9]{2}$";
	String REGEX_MOBILE_NUMBER2 = "^((\\+38)?(\\()?0[0-9]{2}(\\))?[0-9]{3}-?[0-9]{2}-?[0-9]{2})|(no)$";
	String REGEX_EMAIL = "^[a-zA-Z0-9][\\w\\.-]{0,25}@[a-zA-Z]{1,10}\\.(com|net|org|ru|ua)$";
	String REGEX_SKYPE = "^[a-zA-Z0-9][\\w\\.]{0,25}$";
	String REGEX_INDEX = "^[0-9]{5}$";
	String REGEX_TOWN = "^[A-Z]{1}[a-zA-Z]{1,15}$";
	String REGEX_STREET = "^[A-Z]{1}[a-z]{1,30}$";
	String REGEX_HOUSE_NUMBER = "^[0-9]{1,3}(\\/[0-9]{1,3})?((-?)[A-Za-z])?$";
	String REGEX_APT_NUMBER = "^[\\d]{1,3}$";
}
