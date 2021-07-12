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
		UserNameImplementation myUserName = new UserNameImplementation();
		boolean result = myUserName.checkValidLastName("Pratap");
		Assert.assertEquals(true, result);
	}

	@Test
	void givenEmail_ShoulHave_ThreeMandatoryPart_TwoOptionalPart() {
		UserNameImplementation myUserName = new UserNameImplementation();
		boolean result = myUserName.checkValidLastName("pratap.abc@gmail.com");
		Assert.assertEquals(true, result);
	}
}
