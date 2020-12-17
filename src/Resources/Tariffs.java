package Resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Tariffs implements Serializable {
    private int payment;
    private int gbPerMonth;
    private int minsForCountryOfResidence;
    private int minsForTheOtherCountries;
    private int websFee;
    private int Id;
    private ArrayList<String> stocks = new ArrayList<String>();

    public int getPayment() { return payment; }
    public int getGbPerMonth() { return gbPerMonth; }
    public int getWebsFee() { return websFee; }
    public int getId() { return Id; }
    public ArrayList<String> getStocks() { return stocks; }

    public void createTariffs(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter the id: ");
        this.Id= in.nextInt();
        System.out.println("\t\t\tEnter payment: ");
        this.payment = in.nextInt();
        System.out.println("\t\t\tEnter GB per month: ");
        this.gbPerMonth = in.nextInt();
        System.out.println("\t\t\tEnter minutes for country of residence: ");
        this.minsForCountryOfResidence = in.nextInt();
        System.out.println("\t\t\tEnter minutes for other countries: ");
        this.minsForTheOtherCountries = in.nextInt();
        System.out.println("\t\t\tEnter web fee: ");
        this.websFee = in.nextInt();
        System.out.println("\t\t\tEnter amount of stocks: ");
        int num = in.nextInt();
        in.nextLine();
        String stock;
        for (int i = 0; i < num; i++) {
            System.out.printf("\n\t\t\tEnter stock of %d. element: ", i+1);
            stock = in.nextLine();
            this.stocks.add(stock);
        }
    }

    public void showTariff(){
        System.out.printf("Payment: %d\n" +
                "\t\t\tGB per month: %d\n" +
                "\t\t\tMinutes for country of residence: %d\n" +
                "\t\t\tMinutes for the other countries: %d\n" +
                "\t\t\tWebs fee: %d\n" +
                 "\t\t\tId: %d\n", this.payment, this.gbPerMonth, this.minsForCountryOfResidence,
                this.minsForTheOtherCountries, this.websFee, this.Id);
        System.out.println("\t\t\tStocks of Tariff: ");
        int i =0;
        for(String s : this.getStocks()) {
            System.out.printf("\t\t\t\t%d) %s\n", i+1, s);
            i++;
        }
    }
    public static final Comparator<Tariffs> CompareByPayment = new Comparator<Tariffs>() {
        @Override
        public int compare(Tariffs a, Tariffs b) {
            return a.getPayment() - b.getPayment();
        }
    };
    public static final Comparator<Tariffs> CompareByGb = new Comparator<Tariffs>() {
        @Override
        public int compare(Tariffs a, Tariffs b) {
            return a.getGbPerMonth() - b.getGbPerMonth();
        }
    };
    public static final Comparator<Tariffs> CompareByFee = new Comparator<Tariffs>() {
        @Override
        public int compare(Tariffs a, Tariffs b) {
            return a.getWebsFee() - b.getWebsFee();
        }
    };
}
