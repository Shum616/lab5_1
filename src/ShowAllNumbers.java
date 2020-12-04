import Resources.MotherBase;

public class ShowAllNumbers implements  Command {
    MotherBase base;

    public ShowAllNumbers(MotherBase base) {
        this.base = base;
    }

    public void execute() {
        System.out.printf("\n\tAll numbers:");
        base.showAllNumbers();
    }
}
