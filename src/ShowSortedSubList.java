import Resources.MotherBase;

public class ShowSortedSubList implements Command{
    MotherBase base;

    public ShowSortedSubList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.SortSubcompanyList();
    }
}
