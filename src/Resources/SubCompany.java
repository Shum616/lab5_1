package Resources;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Scanner;

public class SubCompany extends MotherBase implements Serializable {
    private String country;
    private int iD;

    public String getCountry() { return country; }
    public int getiD() { return iD; }

    public void createSubcompany(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter the country: ");
        this.country = in.nextLine();
        System.out.println("\t\t\tEnter id: ");
        this.iD = in.nextInt();
    }
    public void showSubcompany(){
        System.out.printf("Country: %s\n" +
                        "\t\t\tID: %d\n",
                this.country, this.iD);
    }

    public static final Comparator<SubCompany> CompareByCountry = new Comparator<SubCompany>() {
        @Override
        public int compare(SubCompany a, SubCompany b) {
            return a.getCountry().compareTo(b.getCountry());
        }
    };

    public static final Comparator<SubCompany> CompareById = new Comparator<SubCompany>() {
        @Override
        public int compare(SubCompany a, SubCompany b) {
            return a.getiD() - b.getiD();
        }
    };
}
