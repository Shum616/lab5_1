import Resources.MotherBase;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        MotherBase base = new MotherBase();

        try (FileInputStream f = new FileInputStream("C:\\Users\\Анна\\Desktop\\JavaSmth.txt")){
            ObjectInputStream o = new ObjectInputStream(f);
            base = (MotherBase) o.readObject();
            o.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error initializing stream.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Accumulator s = new Accumulator(base);
        do {
            System.out.println("\t\t\tMenu");
        } while (s.chooseCommandType());

        try(FileOutputStream f = new FileOutputStream("C:\\Users\\Анна\\Desktop\\JavaSmth.txt")) {
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(base);
            o.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        }
    }
}
