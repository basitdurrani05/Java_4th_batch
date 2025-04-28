// Loops

/*
 * 1). For
 * 2). While
 * 3). do-while
 * 4).For- each
 * 
 * 
 */

public class seventh {


    public static void main(String[] args) {


        // 1). For Loop

        // for(int i=1; i>=10; i++){

            /*
             * Step - 1 : int i=1 Start Loop (Initialize) 
             * 
             * Step - 2 : i<=10 Condition i<=10 (10 tak yae loop chalega)
             * 
             * Step - 3 : i++ Increment (i=1 i++ i=2 i++ i=3.........)
             * 
             */

        //     System.out.println(i);
        // }


        // 2). While Loop

        // int i=1;   // 1  2 3 4  5

        // while (i>=10) {  // 10 loop ruk jana chaiyae



            // System.out.println(i); // 1  2  3  4  5..... 10
            // i++;  // 2 3  4  5
            
        // }



        // 3). do-while

        // Galat condition dene per bhi ek baar chalega ye loop 
        // Perfect Loop


        // int i=1;

        // do {

        //     System.out.println(i);
        //     i++;
            
        // } while (i>=10);



        // Break Keyword

        // for(int i=1; i<=10; i++){

        //     if(i==5){

                
        //         break;
        //     }

        //     System.out.println(i);

            
        // }


        // Continue Keyword


        for(int i=1; i<=10; i++){

            if(i==9){
                continue;
            }

            System.out.println(i);

            
        }
        
    }
    
}
