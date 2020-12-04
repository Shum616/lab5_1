import Resources.MotherBase;

public class ShowSortedNumberList implements Command{
    MotherBase base;

    public ShowSortedNumberList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.SortNumberList();
    }
}
