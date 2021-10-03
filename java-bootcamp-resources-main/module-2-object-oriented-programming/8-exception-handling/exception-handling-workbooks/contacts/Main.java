import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {
    static ContactManager manager = new ContactManager();
    public static void main(String[] args) {
        try {
            loadContacts("./contacts.txt");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("CONTACTS LOADED\n\n");
            System.out.println(manager);
            manageContacts();
        }

    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */
    public static void manageContacts() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit");
            String response = scan.nextLine();

            if (response.equals("a")) {
                System.out.print("\tName: ");
                String name = scan.nextLine();
                System.out.print("\tPhone Number: ");
                String phoneNumber = scan.nextLine();
                System.out.print("\tBirth Date: ");
                String birthDate = scan.nextLine();

                if (name.isBlank() || phoneNumber.isBlank() || phoneNumber.length() < 5) {
                    System.out.println("\nThe input you provided is not valid. Registration failed.\n");
                    continue;
                } else {
                    try {
                    manager.addContact(new Contact(name, phoneNumber, birthDate));
                    } catch (ParseException e) {
                        System.err.println(e.getMessage());
                    }
                }

            } else if (response.equals("b")) {
                System.out.println("\nWho would you like to remove?");
                manager.removeContact(scan.nextLine());
            } else {
                break;
            }
            System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
        }
        scan.close();
    }


    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */
    public static void loadContacts(String filename) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            try {
                Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
                manager.addContact(contact);
            } catch (ParseException e) {
                System.err.println(e.getMessage());
            }
        }
        scanFile.close();
    }

}
