package Resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MotherBase implements Serializable {
    private final ArrayList<Tariffs> tarifList = new ArrayList<Tariffs>();
    private final ArrayList<User> userList = new ArrayList<User>();
    private final ArrayList<Numbers> numberList = new ArrayList<Numbers>();
    private final ArrayList<SubCompany> subcompaniesList = new ArrayList<SubCompany>();

    public ArrayList<Tariffs> getTarifList() { return tarifList; }
    public ArrayList<User> getUserList() { return userList; }
    public ArrayList<Numbers> getNumberList() { return numberList; }
    public ArrayList<SubCompany> getAllSubcompanies() { return subcompaniesList; }

    public void AddTariff(Tariffs tariff){
        this.tarifList.add(tariff);
    }
    public void AddUser(User user){
        this.userList.add(user);
    }
    public void AddNumber(Numbers number){ this.numberList.add(number); }
    public void AddSubCompany(SubCompany sub){
        this.subcompaniesList.add(sub);
    }

    public void AddTariffToSub(){
        if(this.getTarifList().isEmpty()){
            System.out.println("\t\t\tTatiff list is empty! Fill it thirst.");
        } else{
            this.showAllSubcompanies();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of subcompany: ");
            int subIndex = in.nextInt() -1;
            while(subIndex < 0 || subIndex > this.getAllSubcompanies().size()){
                System.out.println("\t\t\tEnter the index of subcompany again...  ");
                subIndex = in.nextInt() -1;
            }
            this.showAllTariff();
            System.out.println("\t\t\tEnter index of tariff to add to subcompany: ");
            int tarIndex = in.nextInt() -1;
            while(tarIndex < 0 || tarIndex > this.getTarifList().size()){
                System.out.println("\t\t\tEnter the index of tariff again...  ");
                tarIndex = in.nextInt() -1;
            }
            (this.getAllSubcompanies().get(subIndex)).AddTariff(this.getTarifList().get(tarIndex));
        }
    }
    public void DeleteTariff(int i) {
        if (this.getAllSubcompanies().isEmpty()) {
            ;
        } else {
            this.deleteTariffFromSub(this.tarifList.get(i));
        }
        this.tarifList.remove(i - 1);
    }

    public void DeleteUser(int i) {
        this.userList.remove(i - 1);
    }
    public void DeleteNumber(){
        if(this.getNumberList().isEmpty()){
            System.out.println("\t\t\tNumber list is empty! There is nothing to delete.");
        } else{
            this.showAllNumbers();
            Scanner in = new Scanner(System.in);
            System.out.println("\n\tEnter the index of number to remove: ");
            int i = in.nextInt()-1;
            while(i < 0 || i > this.getNumberList().size()){
                System.out.println("\t\t\tEnter the index of number again...  ");
                i = in.nextInt() -1;
            }
            if (this.getUserList().isEmpty()) {
                ;
            }
            else{
                this.deleteNumbersFromUsers(this.numberList.get(i));
            }
            this.numberList.remove(i);
        }
    }
    public void DeleteSubCompany(){
        if(this.getAllSubcompanies().isEmpty()){
            System.out.println("\t\t\tSubcompanies list is empty! There is nothing to delete.");
        } else{
            this.showAllSubcompanies();
            Scanner in = new Scanner(System.in);
            System.out.println("\n\tEnter the index of subcompany to remove: ");
            int test = in.nextInt()-1;
            while(test < 0 || test > this.getAllSubcompanies().size()){
                System.out.println("\t\t\tEnter the index of subcompany again...  ");
                test = in.nextInt() -1;
            }
            this.subcompaniesList.remove(test);
        }
    }

    public void showAllTariff(){
        if (this.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll available tariffs:");
            int i = 0;
            for(Tariffs tar : this.getTarifList()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                tar.showTariff();
                i++;
            }
        }
    }
    public void showAllUser(){
        if (this.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll users:");
            int i = 0;
            for(User us : this.getUserList()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                us.showUser();
                i++;
            }
        }
    }
    public void showAllNumbers(){
        if (this.getNumberList().isEmpty()) {
            System.out.println("\t\t\tNumber list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll numbers:");
            int i = 0;
            for(Numbers num : this.getNumberList()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                num.showNumber();
                i++;
            }
        }
    }
    public void showAllSubcompanies(){
        if (this.getAllSubcompanies().isEmpty()) {
            System.out.println("\t\t\tSuncompanies list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll subcompanies:");
            int i = 0;
            for(SubCompany sub : this.getAllSubcompanies()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                sub.showSubcompany();
                i++;
            }
        }
    }

    public void EditTariff(){

        if (this.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to edit.");
        }
        else {
            this.showAllTariff();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of tariff to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > this.getTarifList().size()) {
                System.out.println("\t\t\tEnter the index of tariff again...  ");
                index = in.nextInt() - 1;
            }
            Tariffs tar = new Tariffs();
            tar.createTariffs();
            this.tarifList.set(index, tar);
        }
    }
    public void EditUser(){
        if (this.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to edit.");
        }
        else {
            this.showAllUser();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of user to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > this.getUserList().size()) {
                System.out.println("\t\t\tEnter the index of user again...  ");
                index = in.nextInt() - 1;
            }
            User us = new User();
            us.createUser(this);
            this.userList.set(index, us);
        }
    }
    public void EditNumber(){
        if (this.getNumberList().isEmpty()) {
            System.out.println("\t\t\tNumber list is empty! There is nothing to edit.");
        }
        else {
            this.showAllNumbers();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of number to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > this.getNumberList().size()) {
                System.out.println("\t\t\tEnter the index of number again...  ");
                index = in.nextInt() - 1;
            }
            Numbers num = new Numbers();
            num.createNumber();
            this.numberList.set(index, num);
        }
    }
    public void EditSubcompany(){
        if (this.getAllSubcompanies().isEmpty()) {
            System.out.println("\t\t\tSubcompanies list is empty! There is nothing to edit.");
        }
        else {
            this.showAllSubcompanies();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of subcompany to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > this.getAllSubcompanies().size()) {
                System.out.println("\t\t\tEnter the index of subcompany again...  ");
                index = in.nextInt() - 1;
            }
            SubCompany sub = new SubCompany();
            sub.createSubcompany();
            this.subcompaniesList.set(index, sub);
        }
    }

    public void SortTariffList(){
        if (this.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by payment" +
                    "\n\t\t\t 2 - Sort by Gb" +
                    "\n\t\t\t 3 - Sort by fee");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of tariffs: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(this.tarifList, Tariffs.CompareByPayment);
                    this.showAllTariff();
                    break;
                case 2:
                    Collections.sort(this.tarifList, Tariffs.CompareByGb);
                    this.showAllTariff();
                    break;
                case 3:
                    Collections.sort(this.tarifList, Tariffs.CompareByFee);
                    this.showAllTariff();
                    break;
                default:
                    System.out.println("Something is wrong :(");
            }
        }
    }
    public void SortUserList(){
        if (this.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by id" +
                    "\n\t\t\t 2 - Sort by name");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of users: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(this.userList, User.CompareById);
                    this.showAllUser();
                    break;
                case 2:
                    Collections.sort(this.userList, User.CompareByName);
                    this.showAllUser();
                    break;
                default:
                    System.out.println("\nSomething is wrong :(");
            }
        }
    }
    public void SortNumberList(){
        if (this.getNumberList().isEmpty()) {
            System.out.println("\t\t\tNumber list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by prefix" +
                    "\n\t\t\t 2 - Sort by number" +
                    "\n\t\t\t 3 - Sort by tariff id");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of numbers: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(this.numberList, Numbers.CompareByPrefix);
                    this.showAllNumbers();
                    break;
                case 2:
                    Collections.sort(this.numberList, Numbers.CompareByNumber);
                    this.showAllNumbers();
                    break;
                case 3:
                    Collections.sort(this.numberList, Numbers.CompareByTariffId);
                    this.showAllNumbers();
                    break;
                default:
                    System.out.println("Something is wrong :(");
            }
        }
    }
    public void SortSubcompanyList(){
        if (this.getAllSubcompanies().isEmpty()) {
            System.out.println("\t\t\tSubcompanies list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by country" +
                    "\n\t\t\t 2 - Sort by id");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of subcompany: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(this.subcompaniesList, SubCompany.CompareByCountry);
                    this.showAllSubcompanies();
                    break;
                case 2:
                    Collections.sort(this.subcompaniesList, SubCompany.CompareById);
                    this.showAllSubcompanies();
                    break;
                default:
                    System.out.println("\nSomething is wrong :(");
            }
        }
    }
    public void deleteTariffFromSub(Tariffs tar){
        for( SubCompany sub: this.getAllSubcompanies()) {
            for (Tariffs tested : sub.getTarifList()) {
                if (tested.getId() == tar.getId()) {
                    sub.getTarifList().remove(tested);
                    break;
                }
            }
        }
    }

    public void deleteNumbersFromUsers(Numbers num){
        for( User use: this.getUserList()) {
            for (Numbers tested : use.getCurrentNumbers()) {
                if (tested.getNumber() == num.getNumber()) {
                    use.getCurrentNumbers().remove(tested);
                    break;
                }
            }
        }
    }
    public void FindUsersTariffById(){
        this.showAllUser();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter number index  of user: ");
        int userIndex = in.nextInt() -1;
        User newOne = userList.get(userIndex);
        System.out.println("\t\t\tEnter his or her number index: ");
        int numberIndex = in.nextInt() -1;
        Numbers testOne = (newOne.getCurrentNumbers()).get(numberIndex);
        int check = 0;
        for(Tariffs tar : this.getTarifList()) {
            if (testOne.getTariff() == tar.getId()) {
                System.out.println("\t\t\tUsers` tariff: ");
                tar.showTariff();
                break;
            }
            else {
                ;
            }
        }
    }

    public void ModifyTariffList(){
        System.out.println("\t\t\tAvailable Subcompanies: ");
        this.showAllSubcompanies();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter the index of subcompany: ");
        int subIndex = in.nextInt() -1;
        SubCompany testOne = (this.getAllSubcompanies()).get(subIndex);
        System.out.println("\t\t\tAvailable tariffs: ");
        this.showAllTariff();
        System.out.println("\t\t\tSub tariffs: ");
        testOne.showAllTariff();
        int check = 0;
        while (check <= 2){
            System.out.println("\t\t\tAdd tariff to list or delete one? (1 - add, 2-delete, 3- done): ");
            check = in.nextInt();
            if(check == 1){
                System.out.println("\t\t\tEnter the index of tariff to add: ");
                int index = in.nextInt() -1;
                testOne.AddTariff((this.getTarifList()).get(index));
            } if (check == 2) {
                System.out.println("\t\t\tEnter the index of tariff to delete: ");
                int index = in.nextInt() -1;
                testOne.DeleteTariff(index);
            } else{
                break;
            }
        }
    }

    public void FindTariffByPayment(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter minimal payment: ");
        int min = in.nextInt();
        System.out.println("\t\t\tEnter maximum payment: ");
        int max = in.nextInt();
        for(Tariffs tar : this.getTarifList()) {
            if (tar.getPayment() >= min && tar.getPayment() <= max) {
                tar.showTariff();
            }
        }
    }
///////////////////////////////////will it work?
    public void FindUsersOnTariff(){
        System.out.println("\t\t\tAvailable Tariffs: ");
        this.showAllTariff();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter index of tariff: ");
        int tarIndex = in.nextInt() -1;
        Tariffs tar = (this.getTarifList()).get(tarIndex);
        int Id = tar.getId();
        for(User us : this.getUserList()) {
            for(Numbers num : us.getCurrentNumbers()) {
                if (num.getTariff() == Id) {
                    break;
                }
            }
            us.showUser();
        }
    }
    public void AddNumberToUser(){
        this.showAllUser();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter index of user: ");
        int userIndex = in.nextInt() -1;
        this.showAllNumbers();
        System.out.println("\t\t\tEnter index of number to add: ");
        int numberIndex = in.nextInt() -1;
        (this.getUserList().get(userIndex)).AddNumberToUser(this.getNumberList().get(numberIndex));
    }
}
