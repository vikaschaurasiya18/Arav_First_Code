import java.util.Scanner;
public class VSCfunctions{

//     1. CALCULATE SUM FUNCTION:----------------------------------

//    public static void calculateSum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter b: ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("Sum = "+sum);
//    }

//      2. FACTORIAL FUNCTION:-----------------------------------

//    public static void printFactorial(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int factorial = 1;
//        if(n<0){
//            System.out.println("Invalid Number");
//            return;
//        }
//        else if(n==0){
//            System.out.println(1);
//            return;
//        }
//        for(int i = n; i>=1; i--){
//            factorial = factorial*i;
//        }
//        System.out.println("The factorial of the number is: "+factorial);
//    }

//    3. PRIME NUMBER CHECK FUNCTION:-----------------------------------------

//    public static void checkPrime(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to check for PRIME: ");
//        int n = sc.nextInt();
//        for(int i =2; i<=(n/2); i++){
//            if(n%i==0){
//                System.out.println(n+" is not a Prime Number!!!");
//                break;
//            }
//            else{
//                System.out.println(n+" is a Prime Number!!!");
//                break;
//            }
//        }
//    }

//    4. EVEN ODD NUMBER CHECK FUNCTION:---------------------------------

//    public static void checkEven(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to check for EVEN: ");
//        int n = sc.nextInt();
//        if(n==0){
//            System.out.println("Your number '0' is neither an EVEN nor an ODD!!!");
//        }
//        else if(n%2==0){
//            System.out.print(n+" is an Even Number!!!");
//        }
//        else if(n<0){
//            System.out.println("Your Number is a Negative Number!!!");
//        }
//        else{
//            System.out.println(n+" is not a EVEN Number!!!");
//        }
//    }

//     5. TO PRINT THE TABLE FUNCTION:------------------------------

//    public static void table(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want the table: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=10; i++){
//            System.out.println(n+"x"+i+"="+n*i);
//        }
//    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        calculateSum();
//        printFactorial();
//        checkPrime();
//        checkEven();
//        table();
        System.out.print("Call succussfull!!!");


    }
}