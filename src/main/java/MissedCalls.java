import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private final Map<LocalDateTime, String> missedCalls;
    public MissedCalls() {
        missedCalls = new TreeMap<>();
    }

    public void addMissedCall(String phoneNumber) {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            if (missedCalls.get(now) != null) continue;
            missedCalls.put(now, phoneNumber);
            break;
        }
    }

    public boolean hasMissedCallFromPhone(String phoneNumber) {
        return missedCalls.containsValue(phoneNumber);
    }

    public void printMissedCalls(Phonebook phonebook) {
        System.out.println("Пропущенные вызовы:");
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            Contact contact = phonebook.getContactByPhone(entry.getValue());
            System.out.println(entry.getKey() + " " + (contact == null ? entry.getValue() : contact));
        }
    }
}
