import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Lastname: ");
        String lastname = myObj.nextLine();

        System.out.print("Name: ");
        String name = myObj.nextLine();

        System.out.print("Gender: ");
        String gender = myObj.nextLine();

        System.out.print("Age: ");
        byte age = myObj.nextByte();

        System.out.println("Lastname: "+ lastname);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);

    }
}