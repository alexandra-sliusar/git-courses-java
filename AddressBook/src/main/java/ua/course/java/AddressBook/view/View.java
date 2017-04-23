package ua.course.java.AddressBook.view;

public class View {

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printWrongInput() {
		printMessage(StringConstants.WRONG_INPUT_STRING);
	}

	public void printInputName() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_NAME);
	}

	public void printInputLastname() {
		printMessage(
				StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_LASTNAME);
	}

	public void printInputPatronymic() {
		printMessage(
				StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_PATRONYMIC);
	}

	public void printInputNickname() {
		printMessage(
				StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_NICKNAME);
	}

	public void printInputHomeNumber() {
		printMessage(
				StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_HOMENUMBER);
	}

	public void printInputMobileNumber() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL
				+ StringConstants.INPUT_MOBILENUMBER1);
	}

	public void printInputMobileNumber2() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL
				+ StringConstants.INPUT_MOBILENUMBER2);
	}

	public void printInputEmail() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_EMAIL);
	}

	public void printInputSkype() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_SKYPE);
	}

	public void printInputIndex() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_INDEX);
	}

	public void printInputTown() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_TOWN);
	}

	public void printInputStreet() {
		printMessage(StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_STREET);
	}

	public void printInputHouseNumber() {
		printMessage(
				StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_HOUSENUMBER);
	}

	public void printInputApartmentNumber() {
		printMessage(
				StringConstants.PLEASE_INPUT_STRING + StringConstants.SPACE_SYMBOL + StringConstants.INPUT_APTNUMBER);
	}
}
