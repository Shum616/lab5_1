import Resources.MotherBase;

public class ModufySubtariffList implements Command {
    MotherBase base;

    public ModufySubtariffList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.ModifyTariffList();
    }
}

