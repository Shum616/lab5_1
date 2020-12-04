import Resources.MotherBase;

import java.util.Scanner;

public class DeleteTariff implements  Command{
    MotherBase base;

    public DeleteTariff(MotherBase base){
        this.base = base;
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of tariff to remove: ");
        base.DeleteTariff(in.nextInt());


    }
}
