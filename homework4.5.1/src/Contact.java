import java.util.Objects;

public class Contact {
    private String name;
    private String number;

    Contact (String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, number);
    }

    @Override
    public boolean equals(Object obj){
        Contact contact = (Contact) obj;
        return name.equals(contact.name) && number.equals(contact.number);
    }

    @Override
    public String toString(){
        return name + ": " + number;
    }
}
