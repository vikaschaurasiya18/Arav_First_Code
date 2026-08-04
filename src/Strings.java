import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        String name  = "Vikas";
//        String fullName = "Vikas Chaurasiya";
//        String Sentence = "My name is Vikas Chaurasiya";

//        String name = sc.nextLine();
//        System.out.println("Your name is: "+name);

        //CONCATENATION:------------------------------------------
//        String firstName = "Tony";
//        String lastName = "Stark";
//        String fullName = firstName+" "+lastName;
//        System.out.println(fullName);
//        for (int i = 0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }
        //COMPARING THE STRINGS:-------------------------------
//        String name1 = "wello";
//        String name2 = "hello";
//        if(name1.compareTo(name2)>0){
//            System.out.println("String1 is greater");
//        }
//        else if(name1.compareTo(name2)<0){
//
//            System.out.println("String2 is greater");
//        }
//        else{
//            System.out.println("Strings are Equal");
//        }

        //SUB STRING:--------------------------

//        String sentence = "My name is Tony";
//        int index = sentence.indexOf('T');
//        String name = sentence.substring(index, sentence.length());
//        System.out.println(name);

        //STRINGBUILDER:----------------------------

         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);
//         System.out.println(sb.charAt(0));

         //REPLACING ANY INDEX WITH NEW ONE:----------------
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);

        //INSERTING AT ANY INDEX POSITION:-----------------------
//        sb.insert(2,'n');
//        System.out.println(sb);

        // DELETING ANY CHAR AT ANY INDEX:-------------------------
//        sb.delete(2,3);
//        System.out.println(sb);

        //ADDING ANY CHAR AT THE END:----------------------
//        sb.append(" Stark");
//        System.out.println(sb);

        //REVERSING ANY STRING:--------------------------
        String name = "VIKASchaurasiya";
        for (int i = name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}