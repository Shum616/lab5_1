import Resources.MotherBase;

import java.util.Scanner;

public class DeleteCommands {
    private final Command deleteNumber;
    private final Command deleteSubcompany;
    private final Command deleteTariff;
    private final Command deleteUser;

    public DeleteCommands(MotherBase base) {
        this.deleteNumber = new DeleteNumber(base);
        this.deleteSubcompany =new DeleteSubcompany(base);
        this.deleteTariff =new DeleteTariff(base);
        this.deleteUser = new DeleteUser(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - delete number\n"
                + "\t2 - delete subcompany\n"
                + "\t3 - delete tariff\n"
                + "\t4 - delete user\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                deleteNumber();
                break;
            case 2:
                deleteSubcompany();
                break;
            case 3:
                deleteTariff();
                break;
            case 4:
                deleteUser();
                break;
            default:
                return false;
        }
        return true;
    }

    private void deleteNumber() { deleteNumber.execute(); }
    private void deleteSubcompany() { deleteSubcompany.execute(); }
    private void deleteTariff() { deleteTariff.execute(); }
    private void deleteUser() { deleteUser.execute(); }
}
