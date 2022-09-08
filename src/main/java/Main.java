public class Main {
    public static void main(String[] args) {
        Contact contactTanya = new Contact("Таня", "+79177777777");
        Contact contactVasya = new Contact("Вася", "+78971456687");
        Contact contactNadya = new Contact("Надя", "+7999999999");

        Phonebook phoneBookPetya = new Phonebook("Телефонный справоник Пети");
        phoneBookPetya.addContact(contactVasya);
        phoneBookPetya.addContact(contactNadya);
        phoneBookPetya.addContact(contactTanya);
        phoneBookPetya.addContact(contactVasya);
        phoneBookPetya.addContact(contactTanya);

        MissedCalls missedCalls = new MissedCalls();
        missedCalls.addMissedCall(contactTanya.getPhone());
        missedCalls.addMissedCall("8 800 777 77 77");
        missedCalls.addMissedCall(contactVasya.getPhone());

        missedCalls.printMissedCalls(phoneBookPetya);
    }
}