import Resources.MotherBase;

import java.util.Scanner;

public class DeleteUser implements  Command {
    MotherBase base;

    public DeleteUser(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if (base.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to delete.");
        } else{
            base.showAllUser();
            Scanner in = new Scanner(System.in);
            System.out.println("\n\tEnter the index of user to remove: ");
            int test = in.nextInt();
            while(test < 0 || test > base.getUserList().size()){
                System.out.println("\t\t\tEnter the index of user again...  ");
                test = in.nextInt() -1;
            }
            base.DeleteUser(test);
        }
    }
}
