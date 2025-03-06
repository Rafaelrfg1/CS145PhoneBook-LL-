//Name: Rafael Figueroa
//Date: 3/5/2025
//Partners: Ben and Kennedi
//Assignemnt: Linked Lists (Phone Book) 





import java.util.Scanner;
//MAIN CLASS
public class PhoneBookApp {
 public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        //Initiates what the user will see depending on their choice
        int choice;
        //Displays the menu for the user to choose from
        do {
            System.out.println("\n--- PHONE BOOK MENU ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            //Takes in that user input to choose what to display next
            choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                //This case allows the user to add a contact to the phone book
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    phoneBook.addContact(new Contact(name, phone, address));
                    System.out.println("Contact added.");
                    break;
                //This case allows the user to remove a contact from the phone book
                case 2:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    phoneBook.removeContact(removeName);
                    System.out.println("Contact removed (if existed).");
                    break;
                //This case seraches for a name in the phone book and displays their number and address
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Contact result = phoneBook.contacts.stream()
                        .filter(c -> c.getName().equalsIgnoreCase(searchName))
                        .findFirst()
                        .orElse(null);

                    if (result != null)
                        System.out.println(result);
                    else
                        System.out.println("Contact not found.");
                    break;
                //This case just displays everything that has been stored in that specific run of the program
                case 4:
                    phoneBook.displayAllContacts();
                    break;
                //This case ends the program when the user inputs a 0
                case 0:
                    System.out.println("Goodbye!");
                    break;
                //This is for when the user doesn't input a valid choice and will throw an exception
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
            //This is to continue the loop until the user input a 0
        } while (choice != 0);
        //Closes the scanner and ends the program. 
        scanner.close();
    }
}





