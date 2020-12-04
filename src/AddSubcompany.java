import Resources.MotherBase;
import Resources.SubCompany;

public class AddSubcompany implements Command{
    MotherBase base;

    public AddSubcompany(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        SubCompany sub = new SubCompany();
        sub.createSubcompany();
        base.AddSubCompany(sub);
    }
}
