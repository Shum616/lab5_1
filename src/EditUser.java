import Resources.MotherBase;

public class EditUser implements  Command{
    MotherBase base;

    public EditUser(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.EditUser();
    }
}