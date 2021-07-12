import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserNameTest {

	@Test
	void givenUserName_ShouldBeginWithAUpperCase_AndHaveMinimumThreeCharacters() {
		UserNameImplementation myUserName = new UserNameImplementation();
		boolean result = myUserName.checkValidFirstName("AbAbcde");
		Assert.assertEquals(true, result);
	}

}
