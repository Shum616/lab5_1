import Resources.MotherBase;

import java.util.Scanner;

public class DeleteNumber implements  Command{
    MotherBase base;

    public DeleteNumber(MotherBase base){
        this.base = base;
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of number to remove: ");
        base.DeleteNumber(in.nextInt());
    }
}
