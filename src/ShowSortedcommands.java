import Resources.MotherBase;

import java.util.Scanner;

public class ShowSortedcommands {
    private final Command showSortedNumber;
    private final Command showSortedSubcompany;
    private final Command showSortedTariff;
    private final Command showSortedUser;

    public ShowSortedcommands(MotherBase base) {
        this.showSortedNumber = new ShowSortedNumberList(base);
        this.showSortedSubcompany =new ShowSortedSubList(base);
        this.showSortedTariff =new ShowSortedTariffList(base);
        this.showSortedUser = new ShowSortedUserList(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - show sorted numbers\n"
                + "\t2 - show sorted subcopmpanies\n"
                + "\t3 - show sorted tariffs\n"
                + "\t4 - show sorted users\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                showSortedNumber();
                break;
            case 2:
                showSortedSubcompany();
                break;
            case 3:
                showSortedTariff();
                break;
            case 4:
                showSortedUser();
                break;
            default:
                return false;
        }
        return true;
    }

    private void showSortedNumber() { showSortedNumber.execute(); }
    private void showSortedSubcompany() { showSortedSubcompany.execute(); }
    private void showSortedTariff() { showSortedTariff.execute(); }
    private void showSortedUser() { showSortedUser.execute(); }
}
