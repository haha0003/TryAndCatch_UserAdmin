package UserAdmin;

import java.util.Scanner;

public class Menu {

private String menuName;
private String[] menuChoices;
private String menuChoose;


    Menu(String menuName, String menuChoose, String[] menuChoices){
    this.menuName = menuName;
    this.menuChoose = menuChoose;
    this.menuChoices = menuChoices;
}

public void printMenu(){
    System.out.println(menuName);
    for (int i = 0; i < menuChoices.length;i++){
        System.out.println(menuChoices[i]);
    }
    System.out.println(menuChoose);
}

public int readChoice(){
    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int choice = 0;

    while (! valid){
        if (scanner.hasNextInt()){
            choice = scanner.nextInt();
            valid = true;
        } else {
            scanner.nextLine();
        }
    }
    return choice;
}

}
