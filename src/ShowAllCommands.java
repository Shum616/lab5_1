import Resources.MotherBase;

import java.util.Scanner;

public class ShowAllCommands {
    private final Command showAllNumber;
    private final Command showAllSubcompany;
    private final Command showAllTariff;
    private final Command showAllUser;

    public ShowAllCommands(MotherBase base) {
        this.showAllNumber = new ShowAllNumbers(base);
        this.showAllSubcompany =new ShowAllSubCompanies(base);
        this.showAllTariff =new ShowAllTariffs(base);
        this.showAllUser = new ShowAllUsers(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - show all numbers\n"
                + "\t2 - show all subcopmpanies\n"
                + "\t3 - show all tariffs\n"
                + "\t4 - show all users\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                showAllNumber();
                break;
            case 2:
                showAllSubcompany();
                break;
            case 3:
                showAllTariff();
                break;
            case 4:
                showAllUser();
                break;
            default:
                return false;
        }
        return true;
    }

    private void showAllNumber() { showAllNumber.execute(); }
    private void showAllSubcompany() { showAllSubcompany.execute(); }
    private void showAllTariff() { showAllTariff.execute(); }
    private void showAllUser() { showAllUser.execute(); }
}
