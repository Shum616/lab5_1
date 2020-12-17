import Resources.MotherBase;
import Resources.Tariffs;

import java.util.Scanner;

public class ShowAllTariffs implements  Command{
    MotherBase base;

    public ShowAllTariffs(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.showAllTariff();
    }
}
