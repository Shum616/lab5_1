import Resources.MotherBase;

public class Main {


    public static void main(String[] args) {
        MotherBase base = new MotherBase();
        Accumulator s = new Accumulator(base);
        do {
            System.out.println("\t\t\tMenu");
        } while (s.chooseCommand());
    }
}
