import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserNameTest {

	@Test
	void givenFirstName_ShouldBeginWithAUpperCase_AndHaveMinimumThreeCharacters() {
		UserNameImplementation myUserName = new UserNameImplementation();
		boolean result = myUserName.checkValidFirstName("Shubham");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void givenLastName_ShouldBeginWithAUpperCase_AndHaveMinimumThreeCharacters() {
		UserNameImplementation myLastName = new UserNameImplementation();
		boolean result = myLastName.checkValidLastName("Pratap");
		Assert.assertEquals(true, result);
	}

	void givenEmail_ShoulHave_ThreeMandatoryPart_TwoOptionalPart() {
		UserNameImplementation myEmail = new UserNameImplementation();
		boolean result = myEmail.checkValidLastName("pratap.1804@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	void givenMobile_ShouldBeginWithCountryCode_AndHaveMinimumTenNumbers() {
		UserNameImplementation myMobileNumber = new UserNameImplementation();
		boolean result = myMobileNumber.checkValidMobileNumber("91 8989156503");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_MinimumEightCharacters() {
		UserNameImplementation myPasswordFirstRule = new UserNameImplementation();
		boolean result = myPasswordFirstRule.checkForValidPasswordFirstRule("abcdefgh");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_AtleatOneUpperCaseCharacter() {
		UserNameImplementation myPasswordSecondRule = new UserNameImplementation();
		boolean result = myPasswordSecondRule.checkForValidPasswordSecondRule("abcdefghA");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_AtleatOneUpperCaseCharacter_WithOneNumeric() {
		UserNameImplementation myPasswordThirdRule = new UserNameImplementation();
		boolean result = myPasswordThirdRule.checkForValidPasswordThirdRule("abcdefghiA123");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_AtleatOneUpperCaseCharacter_WithOneNumeric_MustContainAsymbol() {
		UserNameImplementation myPasswordFourthRule = new UserNameImplementation();
		boolean result = myPasswordFourthRule.checkForValidPasswordFourthRule("abcdefghiA123@");
		Assert.assertEquals(true, result);
	}
}