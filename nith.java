// 2). Multidimensional Array / 2D / 3D / Matrix

import java.util.Scanner;

public class nith {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Matrix : ");
        // int [][]a = new int[5][5];   // 2 Row 2 Column


        // // Input
        // for(int i=0; i<a.length; i++){  // Row

        //     for(int j=0; j<a.length; j++){   // Column

        //         a[i][j] = sc.nextInt();


        //     }
        // }


        // // Print


        // System.out.println("Matrix : ");



        // for(int i=0; i<a.length; i++){  // Row

        //     for(int j=0; j<a.length; j++){   // Column

        //         System.out.print(a[i][j]+" ");


        //     }


        //     System.out.println();
        // }



        // Matrix Revision 


        Scanner mohan = new Scanner(System.in);

        System.out.println("Enter Matrix : ");
        int a[][] = new int[3][3];



        // Input
        for(int i=0; i<a.length; i++){

            for(int j=0; j<a.length; j++){

                a[i][j] = mohan.nextInt();
            }

            
        }


        // Print

        System.out.println("Matrix : ");

        for(int i=0; i<a.length; i++){

            for(int j=0; j<a.length; j++){

               System.out.print(a[i][j]+" ");
            }

            System.out.println();
            
        }

        








        
    }
    
}
