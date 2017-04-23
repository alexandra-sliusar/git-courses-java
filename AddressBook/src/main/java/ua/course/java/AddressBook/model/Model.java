package ua.course.java.AddressBook.model;

public class Model {
	private String name;
	private String lastname;
	private String patronymic;
	private String fullName;
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
	private String fullAddress;

	private String dateOfCreation;
	private String dateOfModification;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHomenumber() {
		return homenumber;
	}

	public void setHomenumber(String homenumber) {
		this.homenumber = homenumber;
	}

	public String getMobilenumber1() {
		return mobilenumber1;
	}

	public void setMobilenumber1(String mobilenumber1) {
		this.mobilenumber1 = mobilenumber1;
	}

	public String getMobilenumber2() {
		return mobilenumber2;
	}

	public void setMobilenumber2(String mobilenumber2) {
		this.mobilenumber2 = mobilenumber2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getDateOfModification() {
		return dateOfModification;
	}

	public void setDateOfModification(String dateOfModification) {
		this.dateOfModification = dateOfModification;
	}

	@Override
	public String toString() {
		return "Model: \n FullName " + getFullName() + "\n Nickname " + getNickname() + "\n Home number "
				+ getHomenumber() + "\n Mobile number " + getMobilenumber1() + "\n Mobile number 2 "
				+ getMobilenumber2() + "\n E-mail " + getEmail() + "\n Skype " + getSkype() + "\n Full address "
				+ getFullAddress() + "\n Date of creation " + getDateOfCreation() + "\n Date of modification "
				+ getDateOfModification();
	}

}
