import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private Phonebook sut;

    @BeforeEach
    public void generateData() {
        sut = new Phonebook("test phonebook");
    }

    @Test
    public void testGetExistingContact() {
        // arrange
        String phone = "+798651474";
        Contact test1 = new Contact("test", phone);

        // act
        sut.addContact(test1);
        Contact result = sut.getContactByPhone(phone);

        // assert
        Assertions.assertEquals(test1, result);
    }

    @Test
    public void testGetMissingContact() {
        // act
        Contact c = sut.getContactByPhone("-1");

        // assert
        Assertions.assertNull(c);
    }
}
