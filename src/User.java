public class User extends Person {
    protected boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }


    public static void main(String[] args) {
        User tommy = new User("Brandon", "Gossen", true);
        User otherUser = new User("Tomas", "Hipolito", false);
        System.out.println(tommy.isAdmin());
        System.out.println(otherUser.isAdmin());
    }
}