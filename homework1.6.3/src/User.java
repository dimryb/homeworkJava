public class User {
    private static int totalOnline = 0;
    String email;
    String name;
    String surname;

    public User(String email, String name, String surname){
        this.email = email;
        this.name = name;
        this.surname = surname;
        ++totalOnline;
    }

    static int getTotalOnline(){
        return totalOnline;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("User: ");
        stringBuilder.append(name);
        stringBuilder.append(", ");
        stringBuilder.append(surname);
        stringBuilder.append(", ");
        stringBuilder.append(email);
        return stringBuilder.toString();
    }
}
