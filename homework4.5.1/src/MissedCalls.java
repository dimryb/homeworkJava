import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void add(String call){
        missedCalls.put(LocalDateTime.now(), call);
    }

    public void printMissedCalls(PhoneBook phoneBook){
        int num = 0;
        for (Map.Entry<LocalDateTime,String> entry: missedCalls.entrySet()) {
            LocalDateTime time = entry.getKey();
            String call = entry.getValue();
            Contact contact = phoneBook.search(call);
            if (contact != null){
                call = contact.getName();
            }
            num++;
            System.out.println(num + " позвонил " + call);
        }
    }
}
