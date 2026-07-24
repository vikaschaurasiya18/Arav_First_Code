import java.util.Scanner;
public class VSCfunctions{
    public static void main(String[] args){
        calculateSum();
    }
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }

}