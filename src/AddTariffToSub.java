import Resources.MotherBase;
public class AddTariffToSub implements Command{
    MotherBase base;

    public AddTariffToSub(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.AddTariffToSub();
    }
}