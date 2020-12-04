import Resources.MotherBase;

public class ShowSortedUserList implements Command{
    MotherBase base;

    public ShowSortedUserList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.SortUserList();
    }
}