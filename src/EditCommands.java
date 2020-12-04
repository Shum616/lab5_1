import Resources.MotherBase;

import java.util.Scanner;

public class EditCommands {
    private final Command editNumber;
    private final Command editSubcompany;
    private final Command editTariff;
    private final Command editUser;

    public EditCommands(MotherBase base) {
        this.editNumber = new EditNumber(base);
        this.editSubcompany =new EditSubcompany(base);
        this.editTariff =new EditTariff(base);
        this.editUser = new EditUser(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - edit number\n"
                + "\t2 - edit subcpmpany\n"
                + "\t3 - edit tariff\n"
                + "\t4 - edit user\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                editNumber();
                break;
            case 2:
                editSubcompany();
                break;
            case 3:
                editTariff();
                break;
            case 4:
                editUser();
                break;
            default:
                return false;
        }
        return true;
    }

    private void editNumber() { editNumber.execute(); }
    private void editSubcompany() { editSubcompany.execute(); }
    private void editTariff() { editTariff.execute(); }
    private void editUser() { editUser.execute(); }
}

