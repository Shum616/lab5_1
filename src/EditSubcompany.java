import Resources.MotherBase;

public class EditSubcompany implements  Command{
    MotherBase base;

    public EditSubcompany(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.EditSubcompany();
    }
}