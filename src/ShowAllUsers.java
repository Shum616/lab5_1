import Resources.MotherBase;

public class ShowAllUsers implements  Command {
    MotherBase base;

    public ShowAllUsers(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.showAllUser();
    }
}
