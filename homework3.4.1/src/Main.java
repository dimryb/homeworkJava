import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        try {
            User user = getUserByLoginAndPassword(login, password);

            validateUser(user);

            System.out.println("Доступ предоставлен");
        } catch (UserNotFoundException | AccessDeniedException e) {
            System.out.println("Доступ не предоставлен: "+ e);
        }
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("keil", "keil@gmail.com", "psw", 18);
        User user3 = new User("little", "little@gmail.com", "lit", 15);

        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())){
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if(user.getAge() < 18){
            throw new AccessDeniedException("Smale age");
        }
    }
}
