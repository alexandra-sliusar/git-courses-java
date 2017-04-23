package ua.course.java.AddressBook;

import junit.framework.Assert;
import junit.framework.TestCase;
import ua.course.java.AddressBook.сontroller.RegExpressions;

public class RegexTest extends TestCase {

	public void testRegexNameTrue() {
		String value = "Alexandra";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_NAME));
	}

	public void testRegexNameWithLowcaseFirstLetter() {
		String value = "alexandra";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_NAME));
	}

	public void testRegexNameWithNumbers() {
		String value = "Alexan123dra";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_NAME));
	}

	public void testRegexNameWithSymbols() {
		String value = "Ale-x.and_ra";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_NAME));
	}

	public void testRegexPhoneNumberWithBrackets() {
		String value = "+38(095)9406936";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOME_NUMBER));
	}

	public void testRegexPhoneNumberWithoutBrackets() {
		String value = "+380959406936";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOME_NUMBER));
	}

	public void testRegexPhoneNumberWithDashes() {
		String value = "+38(095)940-69-36";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOME_NUMBER));
	}

	public void testRegexPhoneNumberWithSpaces() {
		String value = "+38 (095) 940 69 36";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_HOME_NUMBER));
	}

	public void testRegexPhoneNumberWithoutPlusThreeEight() {
		String value = "(095)9406936";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOME_NUMBER));
	}

	public void testRegexPhoneNumberSkipped() {
		String value = "no";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_MOBILE_NUMBER2));
	}

	public void testRegexEmailTrue() {
		String value = "alex_19@ua.com";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_EMAIL));
	}

	public void testRegexEmailWithoutAt() {
		String value = "alexisua.com";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_EMAIL));
	}

	public void testRegexEmailWithSpaces() {
		String value = "alex @ ua.com";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_EMAIL));
	}

	public void testRegexEmailWithWrongDomen() {
		String value = "alex@ua.ttd";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_EMAIL));
	}

	public void testRegexIndexTrue() {
		String value = "02139";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_INDEX));
	}

	public void testRegexIndexWithOtherSymbols() {
		String value = "0a1_9";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_INDEX));
	}

	public void testRegexIndexWithMoreThanFiveNumbers() {
		String value = "021397";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_INDEX));
	}

	public void testRegexIndexWithLessThanFourNumbers() {
		String value = "0239";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_INDEX));
	}

	public void testRegexHouseNumberOnlyNumbers() {
		String value = "12";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOUSE_NUMBER));
	}

	public void testRegexHouseNumberCornerHouse() {
		String value = "12/24";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOUSE_NUMBER));
	}

	public void testRegexHouseNumberWithLetters() {
		String value = "12B";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOUSE_NUMBER));
	}

	public void testRegexHouseNumberWithLettersAndDash() {
		String value = "12-B";
		Assert.assertTrue(value.matches(RegExpressions.REGEX_HOUSE_NUMBER));
	}

	public void testRegexHouseNumberWithJustDash() {
		String value = "12-";
		Assert.assertFalse(value.matches(RegExpressions.REGEX_HOUSE_NUMBER));
	}
}
