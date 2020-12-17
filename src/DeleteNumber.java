import Resources.MotherBase;

import java.util.Scanner;

public class DeleteNumber implements  Command{
    MotherBase base;

    public DeleteNumber(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.DeleteNumber();
    }
}
