import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Oyni kiriting: ");
        int ball = myObj.nextInt();

        String oy = switch (ball) {
            case 1 -> "Yanvar";
            case 2 -> "Fevral";
            case 3 -> "Mart";
            case 4 -> "Aprel";
            case 5 -> "May";
            case 6 -> "Iyun";
            case 7 -> "Iyul";
            case 8 -> "Avgust";
            case 9 -> "Sentaby";
            case 10 -> "Oktabr";
            case 11 -> "Noyabr";
            case 12 -> "Dekabr";

            default -> "Bunday oy yo'q";

        };

        System.out.println(oy);
    }
}