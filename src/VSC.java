import java.util.Scanner;
public class VSC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//Q     TO PRINT WHETHER AN ADULT OR MINOR:----------------------------------------------

//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("Hi, Mr." + name + " Your age is " + age + " and you are an adult");
//        } else {
//            System.out.println("Hi, Mr." + name + " Your age is " + age + " and you are a minor");

//Q       TO PRINT WHETHER THE NUMBER IS EVEN OR ODD:  ----------------------------------

//        System.out.print("ENTER THE NUMBER: ");
//        int num1 = sc.nextInt();
//        if (num1%2 == 0){
//            System.out.println("The number "+num1+" even");
//        }
//        else{
//            System.out.println("The number "+num1+" odd");
//        }

//Q      TO PRINT THE GREATER OR SMALLER OR EQUAL: -------------------------------------

//        System.out.print("Enter the First Number: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the Second Number: ");
//        int num2 = sc.nextInt();
//        if(num1 == num2)
//            System.out.println("Both the numbers are equal!!!");
//        else if(num1>num2)
//            System.out.print(num1+" Is greater than "+num2);
//        else
//            System.out.println(num2+" is greater than "+num1);
//
//Q    PRINT THE NAMASTES USING IF, ELSE IF AND ELSE:-----------------------------------

//        System.out.print("Press the buttom: ");
//        int button = sc.nextInt();
//        if(button == 1){
//            System.out.println("Hello!!!");
//        } else if(button==2){
//            System.out.println("Namaste!!!");
//        } else if(button == 3){
//            System.out.println("Bounjur!!!");
//        } else{
//            System.out.println("Invalid Button!!!");
//        }

//Q       USING SWITCH -----------------------------------------------

//        switch (button){
//            case 1:
//                System.out.println("Hello!!!");
//            case 2:
//                System.out.println("Namaste!!!");
//            case 3:
//                System.out.println("Bonjour");
//            case 4:
//                System.out.println("Invalid button!!!");
//        }

//Q        // CALCULATOR USING SWITCH:-------------------------------------------

//        System.out.print("Enter the num1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the num2: ");
//        int num2 = sc.nextInt();
//        System.out.print("Enter the operator: ");
//        char operator = sc.next().charAt(0);
//        switch (operator){
//            case '+':
//                System.out.println("The sum of "+num1+" and "+ num2 + " is "+ (num1+num2));
//                break;
//           case '-':
//                System.out.println("The Subtraction of "+num1+" and "+ num2 + " is "+ (num1-num2));
//                break;
//            case '*':
//                System.out.println("The Multiplication of "+num1+" and "+ num2 + " is "+ (num1*num2));
//                break;
//            case '/':
//                System.out.println("The division of "+num1+" and "+ num2 + " is "+ (num1/num2));
//                break;
//            case '%':
//                System.out.println("The Remainder of "+num1+" and "+ num2 + " is "+ (num1%num2));
//                break;
//            default:
//                System.out.println("Invalid operator!!!");
//        }

//Q        // MONTH NAME FROM MONTH NUMBER USING SWITCH:----------------------------------------------

//        System.out.print("Enter the month number you want to print: ");
//        int month_num = sc.nextInt();
//        switch (month_num){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("Febraury");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("Jun");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Invalid month number!!!");
//        }

//     LOOPS IN JAVA
        // TABLE OF THE INPUT NUMBER USING FOR LOOP:-----------------------------------------

//        System.out.print("Enter the number: ");
//        int num1 = sc.nextInt();
//        for(int counter = 1; counter<11; counter+=1){
//            int table = num1 * counter;
//            System.out.println(table);
//        }
        // TABLE USING WHILE LOOP:-----------------------------------------------------------
//        int i = 1;
//        System.out.print("Enter the number: ");
//        int num1 = sc.nextInt();
//        while(i<11){
//            int table= num1*i;
//            System.out.println("8 x "+i+" = "+ table);
//            i+=1;
//        }
        // TABLE USING DO WHILE LOOP:-------------------------------------------------------
//        System.out.print("Enter the number: ");
//        int num1 = sc.nextInt();
//        int i = 0;
//        do{
//            int table = num1*i;
//            System.out.println(num1+" x "+i+" = "+table);
//            i+=1;
//        } while (i<0);

//Q        // TO PRINT THE SUM OF NATURAL NUMBERS USING WHILE LOOP:-----------------------------------

//        System.out.print("Enter the number till you want the sum: ");
//        int num1 = sc.nextInt();
//        int i = 0;
//        int sum =0;
//        while(i<num1){
//            sum = sum+i;
//            i+=1;
//        }
//        System.out.println("The sum of natural numbers till "+num1+" = "+sum);

//Q        //TO PRINT THE SUM OF NATURAL NUMBERS USING FOR LOOP:-------------------------------------

//        System.out.print("Enter the number till you want the sum: ");
//        int num1 = sc.nextInt();
//        int sum =0;
//        for(int i =0; i<num1;i++){
//            sum=sum+i;
//        }
//        System.out.println("The sum of natural numbers till "+num1+" = "+sum);

//Q        // TO PRINT THE EVEN NUMBERS TILL N:--------------------------------------------------------

//        System.out.print("Enter the number till you want the even numbers: ");
//        int num1 = sc.nextInt();
//        int i = 2;
//        while(i<num1+2){
//            System.out.println(i);
//            i+=2;
//        }

//Q     TO PRINT THE NUMBERS ARE GOOD WITH THE NAME AS WELL:----------------------

//        System.out.println("Enter 0 for exit ");
//        System.out.println("Enter 1 for entering the details ");
//        System.out.print("Enter choice: ");
//        int choice = sc.nextInt();
//        switch(choice){
//            case 0:
//                System.out.println("You chose to exit!!!");
//                break;
//            case 1:
//                sc.nextLine();
//                System.out.print("Enter your name: ");
//                String name = sc.nextLine();
//                System.out.print("Enter your Marks:");
//                int marks = sc.nextInt();
//
//                if (marks >= 90 & marks <=100) {
//                    System.out.println("Hi, " + name + " your " + marks + "mark is good!!!");
//                }
//                else if (marks>=60 & marks<=89) {
//                    System.out.println("Hi, " + name + " your " + marks + " mark is also good!!!");
//                }
//                else if (marks>=0 & marks<=59) {
//                    System.out.println("Hi, " + name + " your " + marks + "mark is good as well!!!");
//                }
//                else{
//                    System.out.println("Invalid marks!!!");
//                    }
//                break;
//            default:
//                System.out.println("Invalid Entry!!!");
//                }

//Q    TO KNOW THE INPUT NUMBER IS PRIME OR NOT:---------------------------------------------------------

//        System.out.print("Enter the number to know if it is prime or not: ");
//        int num = sc.nextInt();
//        int i = 2;
//        int result=0;
//        while(i<num){
//            if (num%i == 0) {
//                result = 1;
//                break;
//            }
//            i+=1;
//        }
//        if(result == 0){
//            System.out.print(num+" is a Prime number!!!");
//        }else{
//            System.out.print(num+" is a non prime number!!!");
//        }



//        for (int i = 5; i >= 1; i--){
//            for(int j = 1; j<=i; j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for(int i = 1;i <=4; i++){
//            System.out.print("*****");
//            System.out.println();
//        }


//        System.out.print("Enter the length of rectangle: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the width of rectangle: ");
//        int m = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=m; j++){
//                if(i==1||j==1||i==n||j==m) {
//                    System.out.print("*  ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }

//Q     TO PRINT THE HALF PYRAMID:------------------------------------------
//        for(int i = 1; i<=4; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();

//      TO PRINT THE SAME IN REVERSE ORDER:------------------------------------
//        for(int i = 5; i>=1; i=i-1){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//                int n = 5;
//
//                for (int i = 1; i <= n; i++) {
//
//                    // Print leading spaces
//                    for (int j = 1; j <= n - i; j++) {
//                        System.out.print("-");
//                    }
//
//                    // Print stars with spaces between them
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("*a");
//                    }
//
//                    System.out.println();
//                }


//        System.out.print("Enter the N: ");
//        int n = sc.nextInt();
//        for (int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n = 4;
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for (int i = 1; i<=n; i++){
//                for (int j = 1; j <= i;j++) {
//                    System.out.print(j);
//                }
//                System.out.println();
//        }

//        int n = 5;
//        for(int i=n; i>=1; i--){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//            }


//        for (int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


//        int n = 5;
//        int num = 15;
//        for(int i = n; i>=1; i--){
//            for(int j = 1; j<=i; j++){
//                System.out.print(num+" ");
//                num--;
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for(int i = 1; i<=n; i++ ){
//            for(int j = 1; j<=i; j++){
//                if((i+j)%2==0){
//                    System.out.print(1+" ");
//                }
//                else{
//                    System.out.print(0+" ");
//                }
//            }System.out.println();
//        }
//Q     TO PRINT THE SOLID RHOMBUS:--------------------------------
//        int n = 5;
//        for(int i = 1; i<=n; i++){
//            for(int j=n-i; j>=1; j--){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//Q     TO PRINT A NUMBER PYRAMID:----------------------------------

//        int n = 5;
//        for(int i = 1; i<=5; i++){
//            for(int j =1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//Q   TO PRINT A PALINDROMIC NUMBER PYRAMID:---------------------------------

//        int n = 5;
//        for (int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for(int j = i; j>1; j--){
//                System.out.print(j+" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//Q    TO PRINT THE BUTTERFLY STARS:------------------------

//        int  n =4;
//        for(int i =1; i<=n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            int spaces = 2*(n-i);
//            for(int j = 1; j<=spaces; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i =n; i>=1; i--){
//            for(int j =1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            int spaces = 2*(n-i);
//            for(int j = 1; j<=spaces; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//Q     TO PRINT THE DIAMOND PATTERN:-------------------------------

//        int n =4;
//        for(int i =1; i<=n; i++){
//            for(int  j = 1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(int j = 2; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i =n; i>=1; i--){
//            for(int  j = 1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(int j = 2; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
}