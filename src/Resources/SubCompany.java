package Resources;

import java.util.Comparator;
import java.util.Scanner;

public class SubCompany extends MotherBase {
    private String country;
    private int iD;

    public String getCountry() { return country; }
    public int getiD() { return iD; }

    public void setCountry(String country) { this.country = country; }
    public void setiD(int iD) { this.iD = iD; }

    public void createSubcompany(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\nEnter the country: ");
        this.country = in.nextLine();
        System.out.printf("\nEnter id: ");
        this.iD = in.nextInt();
    }
    public void showSubcompany(){
        System.out.printf("\tCountry: %s\n" +
                        "\tID: %d\n",
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