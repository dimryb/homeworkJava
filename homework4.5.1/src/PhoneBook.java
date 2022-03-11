import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<Contact>> groupContacts  = new HashMap<>();

    public void createGroup(String groupName){
        groupContacts.put(groupName, new ArrayList<>());
    }

    public void addContactToGroup(String groupName, Contact contact){
        List<Contact> list = groupContacts.get(groupName);
        if(null != list){
            list.add(contact);
        }
    }

    public Contact search(String groupName, String number){
        List<Contact> contacts = groupContacts.get(groupName);
        for (Contact contact: contacts){
            if (contact.getNumber().equals(number)){
                return contact;
            }
        }
        return null;
    }

    public  Contact search(String number){
        for (String groupName: groupContacts.keySet()){
            Contact contact = search(groupName, number);
            if (contact != null) {
                return contact;
            }
        }
        return null;
    }

    public void printGroupContacts(String groupName){
        List<Contact> list = groupContacts.get(groupName);
        if(null != list) {
            System.out.println("Группа " + groupName + ":");
            for (Contact contact : list){
                System.out.println(contact);
            }
        }
    }
}
