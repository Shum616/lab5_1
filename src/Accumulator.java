import Resources.MotherBase;

import java.util.Scanner;

public class Accumulator {
    private final AddCommands add;
    private final DeleteCommands delete;
    private final EditCommands edit;
    private final ShowAllCommands showall;
    private final ShowSortedcommands showsorted;
    private final SpeialCommands special;

    public Accumulator(MotherBase base) {
        add = new AddCommands(base);
        delete = new DeleteCommands(base);
        edit = new EditCommands(base);
        showall = new ShowAllCommands(base);
        showsorted = new ShowSortedcommands(base);
        special = new SpeialCommands(base);
    }

    public boolean chooseCommandType() {
        System.out.print("1 - add elements\n"
                + "2 - delete elements\n"
                + "3 - edit elements\n"
                + "4 - show all elements\n"
                + "5 - show sorted elements\n"
                + "6 - special commands\n"
                + "7 - exit\n");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                edit();
                break;
            case 4:
                showall();
                break;
            case 5:
                showsorted();
                break;
            case 6:
                special();
                break;
            case 7:
                return false;
            default:
                System.out.println("Such command do not exist.");
        }
        return true;
    }

    private void add() { add.chooseCommand(); }
    private void delete() { delete.chooseCommand(); }
    private void edit() { edit.chooseCommand(); }
    private void showall() { showall.chooseCommand(); }
    private void showsorted() { showsorted.chooseCommand(); }
    private void special() { special.chooseCommand(); }
}
