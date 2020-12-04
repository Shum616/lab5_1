import Resources.MotherBase;
import Resources.Numbers;

public class AddNumber implements Command{
    MotherBase base;

    public AddNumber(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        Numbers num = new Numbers();
        num.createNumber();
        base.AddNumber(num);
    }
}
