import Resources.MotherBase;

import java.util.Scanner;

public class DeleteTariff implements  Command{
    MotherBase base;

    public DeleteTariff(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if (base.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to delete.");
        } else{
            base.showAllTariff();
            Scanner in = new Scanner(System.in);
            System.out.printf("\n\tEnter the index of tariff to remove: ");
            int test = in.nextInt();
            while(test < 0 || test > base.getTarifList().size()){
                System.out.println("\t\t\tEnter the index of tariff again...  ");
                test = in.nextInt();
            }
            base.DeleteTariff(test);
        }
    }
}
