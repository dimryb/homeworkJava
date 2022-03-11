public class User {
    private String login;
    private String mail;
    private String password;
    private int age;

    public User(String login, String mail, String password, int age){
        this.login = login;
        this.mail = mail;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
