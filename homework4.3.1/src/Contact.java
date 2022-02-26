import java.util.Objects;

public class Contact {
    private String name;
    private int number;

    Contact (String name, int number){
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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
        return name.equals(contact.name) && number == number;
    }

    @Override
    public String toString(){
        return name + ": " + number;
    }
}
