import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private final Map<String, Contact> phoneBook;
    private String phoneBookName;

    public Phonebook(String phoneBookName) {
        phoneBook = new HashMap<>();
        this.phoneBookName = phoneBookName;
    }

    public void addContact(Contact contact) {
        phoneBook.put(contact.getPhone(),contact);
    }

    public Contact getContactByPhone(String phone) {
        return phoneBook.get(phone);
    }
}
