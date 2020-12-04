import Resources.MotherBase;

public class FindUsersOnTariff  implements Command {
    MotherBase base;

    public FindUsersOnTariff(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.FindUsersOnTariff();
    }
}