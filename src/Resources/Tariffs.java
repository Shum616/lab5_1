package Resources;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Tariffs {
    private int payment;
    private int gbPerMonth;
    private int minsForCountryOfResidence;
    private int minsForTheOtherCountries;
    private int websFee;
    private int Id;
    private ArrayList<String> stocks = new ArrayList<String>();

    public int getPayment() { return payment; }
    public int getGbPerMonth() { return gbPerMonth; }
    public int getMinsForCountryOfResidence() { return minsForCountryOfResidence; }
    public int getMinsForTheOtherCountries() { return minsForTheOtherCountries; }
    public int getWebsFee() { return websFee; }
    public int getId() { return Id; }
    public ArrayList<String> getStocks() { return stocks; }

    public void createTariffs(int payment, int gbPerMonth, int minsForCountryOfResidence,
                              int minsForTheOtherCountries, int websFee, int id, String ... stock){
        this.payment = payment;
        this.gbPerMonth = gbPerMonth;
        this.minsForCountryOfResidence = minsForCountryOfResidence;
        this.minsForTheOtherCountries = minsForTheOtherCountries;
        this.websFee = websFee;
        this.Id = id;
        for (int i = 0; i < stock.length; i++) {
            this.stocks.add(stock[i]);
        }
    }

    public void createTariffs(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\nEnter payment: ");
        this.payment = in.nextInt();
        System.out.printf("\nEnter GB per month: ");
        this.gbPerMonth = in.nextInt();
        System.out.printf("\nEnter minutes for country of residence: ");
        this.minsForCountryOfResidence = in.nextInt();
        System.out.printf("\nEnter minutes for other countries: ");
        this.minsForTheOtherCountries = in.nextInt();
        System.out.printf("\nEnter web fee: ");
        this.websFee = in.nextInt();
        System.out.printf("\nEnter the id: ");
        this.Id= in.nextInt();
        System.out.printf("\nEnter amount of stocks: ");
        int num = in.nextInt();

        String stock;
        for (int i = 0; i < num; i++) {
            System.out.printf("\n\tEnter stock of %d. element: ", i+1);
            stock = in.nextLine();
            this.stocks.add(stock);
        }
    }

    public void showTariff(){
        System.out.printf("\tPayment: %d\n" +
                "\tGB per month: %d\n" +
                "\tMinutes for country of residence: %d\n" +
                "\tMinutes for the other countries: %d\n" +
                "\tWebs fee: %d\n" +
                 "\tId: %d\n" +
                "\tWebs fee: %d", this.payment, this.gbPerMonth, this.minsForCountryOfResidence,
                this.minsForTheOtherCountries, this.websFee, this.Id);
        System.out.printf("\n\tStocks of Tariff: ");
        for(String s : this.getStocks()) {
            System.out.printf(" %s", s);
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
