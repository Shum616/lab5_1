import Resources.MotherBase;

public class ShowSortedTariffList implements Command{
    MotherBase base;

    public ShowSortedTariffList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
      base.SortTariffList();
    }
}
