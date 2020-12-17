package Resources;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Scanner;

public class Numbers implements Serializable {
    private String prefix;
    private int number;
    private int tariffId;

    public String getPrefix() { return prefix; }
    public int getNumber() { return number; }
    public int getTariff() { return tariffId; }

    public void createNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter prefix of element: ");
        this.prefix = in.nextLine();
        System.out.println("\t\t\tEnter number of element: ");
        this.number = in.nextInt();
        System.out.println("\t\t\tEnter tariff id of element: ");
        this.tariffId = in.nextInt();
    }

    public void showNumber() {
        System.out.printf("Prefix: %s\n" +
                        "\t\t\tNumber: %d\n" +
                        "\t\t\tTariff id: %s\n",
                this.prefix, this.number, this.tariffId);
    }

    public static final Comparator<Numbers> CompareByPrefix = new Comparator<Numbers>() {
        @Override
        public int compare(Numbers a, Numbers b) {
            return a.getPrefix().compareTo(b.getPrefix());
        }
    };
    public static final Comparator<Numbers> CompareByNumber = new Comparator<Numbers>() {
        @Override
        public int compare(Numbers a, Numbers b) {
            return a.getNumber() - b.getNumber();
        }
    };
    public static final Comparator<Numbers> CompareByTariffId = new Comparator<Numbers>() {
        @Override
        public int compare(Numbers a, Numbers b) {
            return a.getTariff() - b.getTariff();
        }
    };
}
