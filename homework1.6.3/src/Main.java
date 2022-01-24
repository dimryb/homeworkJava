
public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1@mail.org", "UserName 1", "UserSurname1");
        User user2 = new User("user2@mail.org", "UserName 2", "UserSurname2");
        User user3 = new User("user3@mail.org", "UserName 3", "UserSurname3");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Total online: " + User.getTotalOnline() + " users");
    }
}
