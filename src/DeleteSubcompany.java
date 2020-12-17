import Resources.MotherBase;

import java.util.Scanner;

public class DeleteSubcompany implements  Command{
    MotherBase base;

    public DeleteSubcompany(MotherBase base){
        this.base = base;
    }
    public void execute() {
      base.DeleteSubCompany();
    }
}
