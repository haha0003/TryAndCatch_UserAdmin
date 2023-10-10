package UserAdmin;

public class User {
    private int ID;
    private String name;
    private String password;

    User(int ID, String name, String password){
        this.ID = ID;
        this.name = name;
        this.password = password;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getPassword(){
        return password;
    }

    public void setName (String name){
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User: " +
                "\nID = " + ID +
                "\nName = " + name +
                "\nPassword = " + password;
    }
}
