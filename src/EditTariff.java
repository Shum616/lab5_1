import Resources.MotherBase;

public class EditTariff implements  Command{
    MotherBase base;

    public EditTariff(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.EditTariff();
    }
}
