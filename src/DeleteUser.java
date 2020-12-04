import Resources.MotherBase;

import java.util.Scanner;

public class DeleteUser implements  Command {
    MotherBase base;

    public DeleteUser(MotherBase base){
        this.base = base;
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of user to remove: ");
        base.DeleteUser(in.nextInt());
    }
}
