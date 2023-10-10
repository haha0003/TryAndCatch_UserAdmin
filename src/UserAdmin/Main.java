package UserAdmin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();

    final String fileName = "dada.txt";
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        readFile();

        Menu menu = new Menu("Menu: ", "Choose what to do: ", new String[]{
                "1. View user list",
                "2. Create new user",
                "3. Delete user",
                "9. Quit"
        });

        boolean running = true;

        while (running){
            menu.printMenu();
            int userChoice = menu.readChoice();
            switch (userChoice){
                case 1 -> viewUserList();
                case 2 -> createNewUser();
                case 3 -> deleteUser();
                case 9 -> running = false;
                default -> System.out.println("What do you want to do?");
            }
        }
    }

    public void createNewUser(){
        int id;
        String name;
        String password;
        User user;

        System.out.println("\nCreating new user: ");

        System.out.println("ID: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Name: ");
        name = scanner.nextLine();

        System.out.println("Password: ");
        password = scanner.nextLine();

        user = new User(id, name, password);
        users.add(user);
        saveFile();
        System.out.println("User added\n");
    }

    public void viewUserList(){
        System.out.println("\nUser list: ");
        for (int i = 0; i < users.size();i++){
            System.out.println("#" + i + ": \n" + users.get(i));
            System.out.println();
        }
        System.out.println();
    }

    public void deleteUser(){
        System.out.println("\nDelete user: ");
        viewUserList();
        System.out.println("Enter # you wish deleted");
        int deletedUser = scanner.nextInt();
        scanner.nextLine();

        users.remove(deletedUser);
        System.out.println("User deleted\n");
    }

    public void saveFile() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));

            User user = null;
            writer.println(user.getID());
            writer.println(user.getName());
            writer.println(user.getPassword());

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){

    }

}
