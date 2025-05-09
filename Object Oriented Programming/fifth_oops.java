// Inheritance  - Borrow the properties methods and classes from existing class

// Parent Class  / Super Class / Base Class
// Child Class / Sub class / Derived Class 


// Type : 
/*
 * 1). Single
 * 2). Multi-level
 * 3). Hybrid
 * 4). Hierarchical
 * 5). Multiple (Use through Interface)
 */


//  1). Single Inheritance

class parent{   // Parent Class

    void mohankeparents(){

        System.out.println("1 parents");
    }


}


public class fifth_oops extends parent{    // Child class


    void mohan(){

        System.out.println("1 child");
    }



    public static void main(String[] args) {

        fifth_oops obj = new fifth_oops();

        obj.mohankeparents();
        obj.mohan();



        
    }
    
}
