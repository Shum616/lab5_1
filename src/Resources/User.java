package Resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class User implements Serializable {
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

    public ArrayList<Numbers> getCurrentNumbers() {
        return currentNumbers;
    }

    public void createUser(MotherBase base) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter user`s name: ");
        this.fullName = in.nextLine();
        System.out.println("\t\t\tEnter user`s id: ");
        this.iD = in.nextInt();
        in.nextLine();
        System.out.println("\t\t\tEnter user`s mail: ");
        this.mail = in.nextLine();
        System.out.println("\t\t\tEnter amount of numbers: ");
        int num = in.nextInt();
        Numbers number1 = new Numbers();
        for (int i = 0; i < num; i++) {
            number1.createNumber();
            this.currentNumbers.add(number1);
            base.AddNumber(number1);
            number1 = new Numbers();
        }
    }

    public void showUser() {
        System.out.printf("Full name: %s\n" +
                        "\t\t\tID: %d\n" +
                        "\t\t\tMail: %s\n",
                this.fullName, this.iD, this.mail);
        System.out.println("\t\t\tUser`s Numbers: ");
        int i = 0;
        for (Numbers num : this.getCurrentNumbers()) {
            System.out.printf("\n\t\t\t\t%d) ", i+1);
            num.showNumber();
            i++;
        }
        System.out.printf("\t\t\tNumber of user - %d \n", i);
    }

    public void AddNumberToUser(Numbers number){
        this.currentNumbers.add(number);
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
