public class Contact {
    private final String name;
    private final String phone;

    @Override
    public String toString() {
        return name + " (" + phone + ")";
    }

    public String getPhone() {
        return phone;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
