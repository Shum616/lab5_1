import Resources.MotherBase;

import java.util.Scanner;

public class AddCommands {
    private final Command addNumber;
    private final Command addSubcompany;
    private final Command addTariff;
    private final Command addUser;

    public AddCommands(MotherBase base) {
        this.addNumber = new AddNumber(base);
        this.addSubcompany =new AddSubcompany(base);
        this.addTariff =new AddTariff(base);
        this.addUser = new AddUser(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - add number\n"
                + "\t2 - add subcpmpany\n"
                + "\t3 - add tariff\n"
                + "\t4 - add user\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                addNumber();
                break;
            case 2:
                addSubcompany();
                break;
            case 3:
                addTariff();
                break;
            case 4:
                addUser();
                break;
            default:
                return false;
        }
        return true;
    }

    private void addNumber() { addNumber.execute(); }
    private void addSubcompany() { addSubcompany.execute(); }
    private void addTariff() { addTariff.execute(); }
    private void addUser() { addUser.execute(); }
}