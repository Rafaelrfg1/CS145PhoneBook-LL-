import java.util.LinkedList;


public class PhoneBook {
    LinkedList<Contact> contacts = new LinkedList<>();
    //Constructor to instantiate the linked list
    public PhoneBook() {
        contacts = new LinkedList<>();
    }
    public void addContact(Contact c) { //method to add a contact to the linked list
        contacts.add(c);
    
    }
    public void removeContact(String name) {      //method to remove a contact from the linked list
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }
    public Contact serachByName(String name) {      //method to search for a contact by typing in the name
        for (Contact c : contacts) {
            if(c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;//if name not found prevents the program from crashing
    }
    
    public void displayAllContacts() {//method to display all contacts which will be option 4 in the menu
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

}