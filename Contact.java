public class Contact {
    private String name;
    private String phoneNumber;
    private String address;
    //Constrcutor to get the private variables and allow us to do stuff with them
    public Contact (String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    //Method to display the contact information
    public String toString(){
        return "Name: " + name + " Phone Number: " + phoneNumber + " Address: " + address;
    }
    //Method to get the name of the contact in order to search, remove, or display 
    public String getName() {
        return name;
    }



}