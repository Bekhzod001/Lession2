import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Balni kiriting: ");
        int ball = myObj.nextInt();

        if(ball >= 0 && ball <= 59) {
            System.out.println("F");
        } else if(ball > 59 && ball <= 69) {
            System.out.println("D");
        } else if(ball > 69 && ball <= 79) {
            System.out.println("C");
        } else if(ball > 79 && ball <= 89) {
            System.out.println("B");
        } else if(ball > 89 && ball <= 100) {
            System.out.println("A");
        }
    }
}
