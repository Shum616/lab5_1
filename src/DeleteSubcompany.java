import Resources.MotherBase;

import java.util.Scanner;

public class DeleteSubcompany implements  Command{
    MotherBase base;

    public DeleteSubcompany(MotherBase base){
        this.base = base;
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of subcompany to remove: ");
        base.DeleteSubCompany(in.nextInt());
    }
}
