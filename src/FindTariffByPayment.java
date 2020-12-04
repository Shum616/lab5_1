import Resources.MotherBase;

public class FindTariffByPayment implements Command {
    MotherBase base;

    public FindTariffByPayment(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.FindTariffByPayment();
    }
}
