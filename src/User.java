public class User extends Person {
    protected boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin(boolean position) {
        if (position == isAdmin) {
            return true;
        } else {
            return false;
        }
    }
}
