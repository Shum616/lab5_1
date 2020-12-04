import Resources.MotherBase;

import java.util.Scanner;

public class FindUsersTariffById implements  Command{
    MotherBase base;

    public FindUsersTariffById(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.showAllUser();
        base.FindUsersTariffById();
    }
}

