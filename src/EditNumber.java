import Resources.MotherBase;

public class EditNumber implements  Command{
    MotherBase base;

    public EditNumber(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.EditNumber();
    }
}