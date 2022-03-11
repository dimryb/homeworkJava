public class Main {

    public static void main(String[] args) {
	    PhoneBook phoneBook = new PhoneBook();

        Contact contact1 = new Contact("Contact 1", 1);
        Contact contact2 = new Contact("Contact 2", 2);
        Contact contact3 = new Contact("Contact 3", 3);
        Contact contact4 = new Contact("Contact 4", 4);

        Contact contact101 = new Contact("Contact 101", 101);
        Contact contact102 = new Contact("Contact 102", 102);
        Contact contact103 = new Contact("Contact 103", 103);
        Contact contact104 = new Contact("Contact 104", 104);

        String groupName0 = "Group 0";
        String groupName100 = "Group 100";
        String groupNameAll = "Group All";
        phoneBook.createGroup(groupName0);
        phoneBook.createGroup(groupName100);
        phoneBook.createGroup(groupNameAll);

        phoneBook.addContactToGroup(groupName0, contact1);
        phoneBook.addContactToGroup(groupName0, contact2);
        phoneBook.addContactToGroup(groupName0, contact3);
        phoneBook.addContactToGroup(groupName0, contact4);

        phoneBook.addContactToGroup(groupName100, contact101);
        phoneBook.addContactToGroup(groupName100, contact102);
        phoneBook.addContactToGroup(groupName100, contact103);
        phoneBook.addContactToGroup(groupName100, contact104);

        phoneBook.addContactToGroup(groupNameAll, contact1);
        phoneBook.addContactToGroup(groupNameAll, contact2);
        phoneBook.addContactToGroup(groupNameAll, contact3);
        phoneBook.addContactToGroup(groupNameAll, contact4);
        phoneBook.addContactToGroup(groupNameAll, contact101);
        phoneBook.addContactToGroup(groupNameAll, contact102);
        phoneBook.addContactToGroup(groupNameAll, contact103);
        phoneBook.addContactToGroup(groupNameAll, contact104);

        phoneBook.printGroupContacts(groupName0);
        phoneBook.printGroupContacts(groupName100);
        phoneBook.printGroupContacts(groupNameAll);
    }
}
