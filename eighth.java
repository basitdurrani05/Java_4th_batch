// Array - Collection of Similar type Data.


// 1).One Dimensional
// 2).Multi Dimensional

import java.util.Scanner;

public class eighth{

    public static void main(String[] args) {


        // 1).One Dimensional

        // int []a = {10,20,30,40,50,60,70,80};

        // 10 - 0
        // 20 - 1
        // 30 - 2
        // 40 - 3

        // for(int i=0; i<a.length; i++){

        //     System.out.println(a[i]);
        // }



        // 1).One Dimensional (Input)

        Scanner mohan = new Scanner(System.in);

        // System.out.println("Enter Array Elements : ");
        // int []a = new int[10];


        // Input
        // for(int i=0; i<a.length; i++){

        //     a[i] = mohan.nextInt();
        // }

        // System.out.println("Array Elements : ");

        // Print
        // for(int i=0; i<a.length; i++){

        //     System.out.println(a[i]);
        // }



        System.out.println("Enter Array Elements : ");

        int [] basit = new int[5];


        // Input


        for(int i=0; i<basit.length; i++){


            basit[i] = mohan.nextInt();

        }


        System.out.println("Array Elements : ");


        for(int i=0; i<basit.length; i++){

            System.out.println(basit[i]);


        }



        
    }
}