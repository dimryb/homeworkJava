public class Main {

    public static void main(String[] args) throws InterruptedException {
	    PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        Contact contact1 = new Contact("Contact 1", "111");
        Contact contact2 = new Contact("Contact 2", "222");
        Contact contact3 = new Contact("Contact 3", "333");
        Contact contact4 = new Contact("Contact 4", "444");
        Contact contact10 = new Contact("Contact 10", "1010");

        String groupName0 = "Group 0";
        phoneBook.createGroup("Group 0");
        phoneBook.addContactToGroup(groupName0, contact1);
        phoneBook.addContactToGroup(groupName0, contact2);
        phoneBook.addContactToGroup(groupName0, contact3);
        phoneBook.addContactToGroup(groupName0, contact4);

        String groupName10 = "Group 10";
        phoneBook.createGroup(groupName10);
        phoneBook.addContactToGroup(groupName10, contact10);

        missedCalls.add("111");
        Thread.sleep(10);
        missedCalls.add("1010");
        Thread.sleep(10);
        missedCalls.add("999");

        missedCalls.printMissedCalls(phoneBook);
    }
}
