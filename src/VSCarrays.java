import java.util.*;
public class VSCarrays {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//    PROGRAM FOR LINEAR SEARCH:----------------------------------------------------------

//        System.out.print("Enter the size of the ARRAY: ");
//        int size = sc.nextInt();
//        int num[] = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter the Numbers: ");
//            num[i] = sc.nextInt();
//        }
//        System.out.print("Enter the X whose index value yuo want: ");
//        int x = sc.nextInt();
//        int found = 0;
//        for (int i = 0; i < size; i++) {
//            if (num[i] == x) {
//                System.out.println("Number " + x + " is at " + i);
//                found = 1;
//                break;
//            }
//        }
//        if (found!= 1) {
//            System.out.println("Not Found!!!");
//        }

//    TO SEARCH FOR A NUMBER IN 2D ARRAY:-------------------------------

//        System.out.print("Enter the Rows of the 2D ARRAY: ");
//        int rows = sc.nextInt();
//        System.out.print("Enter the Columns of the 2D ARRAY: ");
//        int cols = sc.nextInt();
//        int[][] numbers = new int[rows][cols];
//        // TAKING INPUTS:----
//        for(int i = 0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        //FOR OUTPUTS:---------
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<cols; j++){
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }
//        // FOR FINDING THE X LOCATION:------------------------------
//        System.out.print("Enter the X which you need to find from the matrix: ");
//        int k = sc.nextInt();
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<cols; j++){
//                if(numbers[i][j]==k){
//                    System.out.println("The Indecis of X is at:" +i+","+j);
//                }
//                if(numbers[i][j]!=k){
//                    System.out.println("Number not found!!!");
//                }
//            }
//        }

// TO TAKE MARKS AS INPUT AND TELL THEM THE PERCENTAGE AND GRADE:--------------------------------------

//        System.out.print("Enter the total number of Subjects: ");
//        int size = sc.nextInt();
//        int[] marks = new int[size];
//        if(size>5){
//            System.out.print("You have entered more than the courses offered");
//        }
//        else {
//            for (int i = 0; i < size; i++) {
//                if (i == 0) {
//                    System.out.print("Enter the Physics Marks: ");
//                    marks[i] = sc.nextInt();
//                } else if (i == 1) {
//                    System.out.print("Enter the Chemistry Marks: ");
//                    marks[i] = sc.nextInt();
//                } else if (i == 2) {
//                    System.out.print("Enter the Maths Marks: ");
//                    marks[i] = sc.nextInt();
//                } else if (i == 3) {
//                    System.out.print("Enter the English Marks: ");
//                    marks[i] = sc.nextInt();
//                } else {
//                    System.out.print("Enter the Subjective Marks: ");
//                    marks[i] = sc.nextInt();
//                }
//            }
//            int sum = 0;
//            for (int i = 0; i < size; i++) {
//                sum += marks[i];
//            }
//            double percentage = (double) sum / size;
//            System.out.print("Your Percentage is: " + percentage + "%");
//            if(percentage>=90 && percentage<=100){
//                System.out.print(" Your marks are really good and you have got A grade!!!");
//            }
//            else if(percentage>=80 && percentage<90){
//                System.out.print(" Your marks are good and have secured B grade");
//            }
//            else if(percentage >=70 && percentage<80){
//                System.out.print(" Your marks are good and have secured C grade");
//            }
//            else if(percentage>=50 && percentage<70){
//                System.out.print(" You need to work hard you are just pass with D grade!!!");
//            }
//            else{
//                System.out.print(" Very poor performance You are fail!!!");
//            }
//        }

//   TO TAKE THE INPUT FROM THE USER AND PRINT THE MATRIX AND ALSO FIND THE X:---------------------------------------

//        System.out.print("Enter the rows: ");
//        int rows = sc.nextInt();
//        System.out.print("Enter the columns: ");
//        int cols = sc.nextInt();
//        int numbers[][] = new int[rows][cols];
//        for(int i  =0; i<rows; i++){
//            System.out.print("Enter the row "+(i+1)+" values: ");
//            for(int j = 0; j<cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        System.out.println("The entered matrix is: ");
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<cols; j++){
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int found = 0;
//        System.out.print("Enter the X you want to find: ");
//        int x = sc.nextInt();
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j< cols; j++){
//                if(numbers[i][j]==x){
//                    System.out.println("The number X is at: "+i+","+j);
//                    found = 1;
//                }
//            }
//        }
//        if(found==0){
//            System.out.println("Number not found!!!");
//     }
    }
}