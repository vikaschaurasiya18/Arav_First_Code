import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = sn.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = sn.nextInt();

        System.out.println("Welcome, " + studentName);
        System.out.println("Your age is, " + studentAge);

    }
}
