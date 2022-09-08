import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private Phonebook pb;

    @BeforeEach
    public void generateData() {
        pb = new Phonebook("test phonebook");
    }

    @Test
    public void testGetExistingContact() {
        String phone = "+798651474";
        Contact test1 = new Contact("test", phone);
        Phonebook pb = new Phonebook("test phonebook");

        pb.addContact(test1);

        Assertions.assertEquals(test1, pb.getContactByPhone(phone));
    }

    @Test
    public void testGetMissingContact() {
        Phonebook pb = new Phonebook("test phonebook");
        Contact c = pb.getContactByPhone("-1");
        Assertions.assertNull(c);
    }
}
