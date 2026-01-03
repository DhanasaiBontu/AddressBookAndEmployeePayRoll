import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(
                firstName, lastName, address,
                city, state, zip, phone, email
        );

        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            contact.displayContact();
            System.out.println("-------------------");
        }
    }
}
