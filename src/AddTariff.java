import Resources.MotherBase;
import Resources.Tariffs;

public class AddTariff implements Command {
    MotherBase base;

    public AddTariff(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        Tariffs tar = new Tariffs();
        tar.createTariffs();
        base.AddTariff(tar);
    }
}


