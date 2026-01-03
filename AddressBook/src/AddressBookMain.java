public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contact person = new Contact(
                "John",
                "Doe",
                "MG Road",
                "Bangalore",
                "Karnataka",
                "560001",
                "9876543210",
                "john.doe@gmail.com"
        );

        person.displayContact();
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContacts();
    }

}
