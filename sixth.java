//  Conditional Statements

import java.util.*;

public class sixth {


    public static void main(String[] args) {


        Scanner mohan = new Scanner(System.in);

        // System.out.println("Enter Number : ");
        // int a = mohan.nextInt();




        // if(a%2==0){    
        //     System.out.println("Even");
        // }

        // else{

        //     System.out.println("Odd");
        // }


        // System.out.println("Enter Age : ");
        // int a = mohan.nextInt();


        // if(a>18){

        //     System.out.println("Jawan Ho.");
        // }

        // else if(a<=0){

        //     System.out.println("Tu toh paida hi nahi hua....");

        // }

        // else{

        //     System.out.println("Bachha Hai re tu.....");
        // }


        System.out.println("Enter Name : ");
        String a = mohan.nextLine();

        System.out.println("Enter Age : ");
        int b = mohan.nextInt();


        switch (b) {

            case 18:
            System.out.println(a+" is a Intelligent");
            break;


            case 24:
            System.out.println(a+" CHarming..");
            break;

            case 27:
            System.out.println(a+" very smart...");
            break;

            default:
            System.out.println("Tu toh gadha ka gadha hi rahega....");
            break;
            
        }


        



        

    }
    
}
