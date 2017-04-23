package ua.course.java.AddressBook.сontroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import ua.course.java.AddressBook.model.Model;
import ua.course.java.AddressBook.view.StringConstants;
import ua.course.java.AddressBook.view.View;

public class ControllerNotebook {

	private View view;
	private Model model;
	private Utilities utilities;

	private String name;
	private String lastname;
	private String patronymic;
	private String nickname;

	private String homenumber;
	private String mobilenumber1;
	private String mobilenumber2;

	private String email;
	private String skype;

	private String index;
	private String town;
	private String street;
	private String houseNumber;
	private String apartmentNumber;

	private String dateOfCreation;
	private String dateOfModification;

	public ControllerNotebook(View view, Model model, Utilities utilities) {
		this.view = view;
		this.model = model;
		this.utilities = utilities;
		setDateOfCreation();
	}

	public void setAllValues() {
		setFullname();
		setNickname();
		setPhones();
		setEmailAndSkype();
		setAddress();
		setDateOfModification();
	}

	public void setFullname() {
		view.printInputLastname();
		lastname = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_LASTNAME);
		view.printInputName();
		name = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_NAME);
		view.printInputPatronymic();
		patronymic = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_PATRONYMIC);
	}

	public String getShortName() {
		StringBuilder sb = new StringBuilder();
		sb.append(lastname).append(StringConstants.SPACE_SYMBOL).append(name.charAt(0))
				.append(StringConstants.DOT_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(patronymic.charAt(0))
				.append(StringConstants.DOT_SYMBOL);
		return sb.toString();
	}

	public void setNickname() {
		view.printInputNickname();
		nickname = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_NICKNAME);
	}

	public void setPhones() {
		view.printInputHomeNumber();
		homenumber = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_HOME_NUMBER);
		view.printInputMobileNumber();
		mobilenumber1 = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_MOBILE_NUMBER);
		view.printInputMobileNumber2();
		mobilenumber2 = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_MOBILE_NUMBER2);
	}

	public void setEmailAndSkype() {
		view.printInputEmail();
		email = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_EMAIL);
		view.printInputSkype();
		skype = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_SKYPE);
	}

	public void setAddress() {
		view.printInputIndex();
		index = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_INDEX);
		view.printInputTown();
		town = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_TOWN);
		view.printInputStreet();
		street = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_STREET);
		view.printInputHouseNumber();
		houseNumber = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_HOUSE_NUMBER);
		view.printInputApartmentNumber();
		apartmentNumber = utilities.checkAndGetStringWithRegex(RegExpressions.REGEX_APT_NUMBER);
	}

	public void setDateOfCreation() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringConstants.DATE_PATTERN);
		dateOfCreation = simpleDateFormat.format(date);
	}

	public void setDateOfModification() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringConstants.DATE_PATTERN);
		dateOfModification = simpleDateFormat.format(date);
	}

	public String getFullAddress() {
		StringBuilder sb = new StringBuilder();
		sb.append(town).append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(street)
				.append(StringConstants.SPACE_SYMBOL).append(StringConstants.STREET_STRING)
				.append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(houseNumber)
				.append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL)
				.append(StringConstants.APT_STRING).append(StringConstants.SPACE_SYMBOL).append(apartmentNumber)
				.append(StringConstants.COMA_SYMBOL).append(StringConstants.SPACE_SYMBOL).append(index);
		return sb.toString();
	}

	public void transferValuesIntoModel() {
		model.setName(name);
		model.setLastname(lastname);
		model.setPatronymic(patronymic);
		model.setFullName(getShortName());
		model.setNickname(nickname);

		model.setHomenumber(homenumber);
		model.setMobilenumber1(mobilenumber1);
		model.setMobilenumber2(mobilenumber2);

		model.setEmail(email);
		model.setSkype(skype);

		model.setIndex(index);
		model.setTown(town);
		model.setStreet(street);
		model.setHouseNumber(houseNumber);
		model.setApartmentNumber(apartmentNumber);
		model.setFullAddress(getFullAddress());

		model.setDateOfCreation(dateOfCreation);
		model.setDateOfModification(dateOfModification);
	}
}
