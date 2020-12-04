package Resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MotherBase implements Serializable {
    private ArrayList<Tariffs> tarifList = new ArrayList<Tariffs>();
    private ArrayList<User> userList = new ArrayList<User>();
    private ArrayList<Numbers> numberList = new ArrayList<Numbers>();
    private ArrayList<SubCompany> subcompaniesList = new ArrayList<SubCompany>();

    public ArrayList<Tariffs> getTarifList() { return tarifList; }
    public ArrayList<User> getUserList() { return userList; }
    public ArrayList<Numbers> getNumberList() { return numberList; }
    public ArrayList<SubCompany> getAllSubcompanies() { return subcompaniesList; }

    public void setTarifList(Tariffs... tarifList) {
        for (int i = 0; i < tarifList.length; i++) {
            this.tarifList.add(tarifList[i]);
        }
    }
    public void setUserList(User... userLists) {
        for (int i = 0; i < userLists.length; i++) {
            this.userList.add(userLists[i]);
        }
    }
    public void setNumberList(Numbers... numberLists) {
        for (int i = 0; i < numberLists.length; i++) {
            this.numberList.add(numberLists[i]);
        }
    }

    public void setSubCompanyList(SubCompany... subCompanies) {
        for (int i = 0; i < subCompanies.length; i++) {
            this.subcompaniesList.add(subCompanies[i]);
        }
    }

    public void SortTariffs(ArrayList<Tariffs> tarifList) {
        Scanner in = new Scanner(System.in);
        System.out.printf("How would you like to sort list of tariffs?\n" +
                "(1 - payment, 2- gbPerMonth, 3- stocks): ");

        int answer = in.nextInt();
        switch (answer){
            case 1:
                tarifList.sort(Comparator.comparing(Tariffs::getPayment));
                break;
            case 2:
                tarifList.sort(Comparator.comparing(Tariffs::getGbPerMonth));
                break;
            case 3:
                tarifList.sort(Comparator.comparing(Tariffs::getWebsFee));
                break;
            default:
                System.out.println("\n You`re wrong somethere in this life.....\n");
        }
    }

    public void AddTariff(Tariffs tariff){
        this.tarifList.add(tariff);
    }
    public void AddUser(User user){
        this.userList.add(user);
    }
    public void AddNumber(Numbers number){
        this.numberList.add(number);
    }
    public void AddSubCompany(SubCompany sub){
        this.subcompaniesList.add(sub);
    }

    public void DeleteTariff(int i){ this.tarifList.remove(i-1); }
    public void DeleteUser(int i){
        this.userList.remove(i-1);
    }
    public void DeleteNumber(int i){
        this.numberList.remove(i-1);
    }
    public void DeleteSubCompany(int i){
        this.subcompaniesList.remove(i-1);
    }

    public void showAllTariff(){
        int i = 0;
        for(Tariffs tar : this.getTarifList()) {
            System.out.printf("\n\t%d) ", i+1);
            tar.showTariff();
            i++;
        }
    }
    public void showAllUser(){
        int i = 0;
        for(User us : this.getUserList()) {
            System.out.printf("\n\t%d) ", i+1);
            us.showUser();
            i++;
        }
    }
    public void showAllNumbers(){
        int i = 0;
        for(Numbers num : this.getNumberList()) {
            System.out.printf("\n\t%d) ", i+1);
            num.showNumber();
            i++;
        }
    }
    public void showAllSubcompanies(){
        int i = 0;
        for(SubCompany sub : this.getAllSubcompanies()) {
            System.out.printf("\n\t%d) ", i+1);
            sub.showSubcompany();
            i++;
        }
    }

    public void EditTariff(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of tariff to edit: ");
        int index = in.nextInt()-1;
        Tariffs tar = new Tariffs();
        tar.createTariffs();
        this.tarifList.set(index, tar);
    }
    public void EditUser(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of user to edit: ");
        int index = in.nextInt()-1;
        User us = new User();
        us.createUser();
        this.userList.set(index, us);
    }
    public void EditNumber(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of number to edit: ");
        int index = in.nextInt()-1;
        Numbers num = new Numbers();
        num.createNumber();
        this.numberList.set(index, num);
    }
    public void EditSubcompany(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of subcompany to edit: ");
        int index = in.nextInt()-1;
        SubCompany sub = new SubCompany();
        sub.createSubcompany();
        this.subcompaniesList.set(index, sub);
    }

    public void SortTariffList(){
        System.out.println("\n\t 1 - Sort by payment" +
                "\n\t 2 - Sort by Gb" +
                "\n\t 3 - Sort by fee");
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the parameter to sort list of tariffs: ");
       switch (in.nextInt()){
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
               System.out.println("\nSomething is wrong :(");
       }
    }
    public void SortUserList(){
        System.out.println("\n\t 1 - Sort by id" +
                "\n\t 2 - Sort by name");
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the parameter to sort list of users: ");
        switch (in.nextInt()){
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
    public void SortNumberList(){
        System.out.println("\n\t 1 - Sort by prefix" +
                "\n\t 2 - Sort by number" +
                "\n\t 3 - Sort by tariff id");
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the parameter to sort list of numbers: ");
        switch (in.nextInt()){
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
                System.out.println("\nSomething is wrong :(");
        }
    }
    public void SortSubcompanyList(){
        System.out.println("\n\t 1 - Sort by country" +
                "\n\t 2 - Sort by id");
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the parameter to sort list of subcompany: ");
        switch (in.nextInt()){
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
    public void deleteTariffFromSub(){}
///////////////////////////////////////////////


    public void FindUsersTariffById(){
        ///////////////////////////////////////////////////
        this.showAllUser();
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter number index  of user: ");
        int userIndex = in.nextInt() -1;
        User newOne = userList.get(userIndex);
        System.out.printf("\n\tEnter his or her number index: ");
        int numberIndex = in.nextInt() -1;
        Numbers testOne = (newOne.getCurrentNumbers()).get(numberIndex);
        int check = 0;
        for(Tariffs tar : this.getTarifList()) {
            if (testOne.getTariff() == tar.getId()) {
                System.out.printf("\n\tUsers` tariff: ");
                tar.showTariff();
                break;
            }
            else {
                ;
            }
        }
    }

    public void ModifyTariffList(){
        System.out.printf("\n\tAvailable Subcompanies: ");
        this.showAllSubcompanies();
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter the index of subcompany: ");
        int subIndex = in.nextInt() -1;
        SubCompany testOne = (this.getAllSubcompanies()).get(subIndex);
        System.out.printf("\n\tAvailable tariffs: ");
        this.showAllTariff();
        System.out.printf("\n\tSub tariffs: ");
        testOne.showAllTariff();
        int check = 0;
        while (check <= 2){
            System.out.printf("\n\tAdd tariff to list or delete one? (1 - add, 2-delete, 3- done): ");
            check = in.nextInt();
            if(check == 1){
                System.out.printf("\n\tEnter the index of tariff to add: ");
                int index = in.nextInt() -1;
                testOne.AddTariff((this.getTarifList()).get(index));
            } if (check == 2) {
                System.out.printf("\n\tEnter the index of tariff to delete: ");
                int index = in.nextInt() -1;
                testOne.DeleteTariff(index);
            } else{
                break;
            }
        }
    }

    public void FindTariffByPayment(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter minimal payment: ");
        int min = in.nextInt();
        System.out.printf("\n\tEnter maximum payment: ");
        int max = in.nextInt();
        for(Tariffs tar : this.getTarifList()) {
            if (tar.getPayment() >= min && tar.getPayment() <= max) {
                tar.showTariff();
            }
        }
    }
///////////////////////////////////will it work?
    public void FindUsersOnTariff(){
        System.out.printf("\n\tAvailable Tariffs: ");
        this.showAllTariff();
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\tEnter index of tariff: ");
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
}
