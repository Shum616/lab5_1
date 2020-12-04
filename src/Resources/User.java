package Resources;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class User {
    private String fullName;
    private int iD;
    private String mail;
    private ArrayList<Numbers> currentNumbers = new ArrayList<Numbers>();

    public String getFullName() {
        return fullName;
    }

    public int getiD() {
        return iD;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Numbers> getCurrentNumbers() {
        return currentNumbers;
    }

    public void createUser(String name, int iD, String mail, Numbers... currentNumber) {
        this.fullName = name;
        this.iD = iD;
        this.mail = mail;
        for (int i = 0; i < currentNumber.length; i++) {
            this.currentNumbers.add(currentNumber[i]);
        }
    }

    public void createUser() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\nEnter user`s name: ");
        this.fullName = in.nextLine();
        System.out.printf("\nEnter user`s id: ");
        this.iD = in.nextInt();
        System.out.printf("\nEnter user`s mail: ");
        this.mail = in.nextLine();
        System.out.printf("\nEnter amount of numbers: ");
        int num = in.nextInt();
        Numbers number1 = new Numbers();
        for (int i = 0; i < num; i++) {
            number1.createNumber();
            this.currentNumbers.add(number1);
        }
    }

    public void showUser() {
        System.out.printf("\tFull name: %s\n" +
                        "\tID: %d\n" +
                        "\tMail: %s\n",
                this.fullName, this.iD, this.mail);
        System.out.printf("\n\tUser`s Numbers: ");
        int i = 0;
        for (Numbers num : this.getCurrentNumbers()) {
            System.out.printf("\n\t%d) ", i+1);
            num.showNumber();
            i++;
        }
    }

    public static final Comparator<User> CompareById = new Comparator<User>() {
        @Override
        public int compare(User a, User b) {
            return a.getiD() - b.getiD();
        }
    };
    public static final Comparator<User> CompareByName = new Comparator<User>() {
        @Override
        public int compare(User a, User b) {
            return a.getFullName().compareTo(b.getFullName());
        }
    };

    public void FindUsersTariff(){
        for (Numbers num : this.getCurrentNumbers()) {
            num.showNumber();
        }
    }
}
