import java.util.Scanner;
public class VSC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Hi, Mr." + name + " Your age is " +age + " and you are an adult");
        }
        else{
            System.out.println("Hi, Mr." + name + " Your age is " + age + " and you are a minor");
        }
    }
}