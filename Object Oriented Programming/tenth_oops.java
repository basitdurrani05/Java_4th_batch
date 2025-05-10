// Polymorphism 

// Poly means many and morphism means form

// Defination : Single action in different ways.

// Type : 

// 1). Compile Time
// 2). Run Time



// 1). Compile Time
public class tenth_oops {

   void mohan(String mom,String sister){

    System.out.println("Home : "+mom+" "+sister);
   }


   void mohan(String company){

    System.out.println("Company : "+company);
   }
    




    public static void main(String[] args) {


        tenth_oops obj = new tenth_oops();

        obj.mohan("Beta","Brother");
        obj.mohan("Software Engineer");

        
        
    }
    
}
