// Abstraction  - Hiding the implementation

// It's used Abstract class.

// Abstract class do not specifiy object body

// Mandatory Note : Ek abstract class mein kam sae kam 1 abstract method hona chaiyae.



abstract class A{   // abstract class


    abstract void mohan();  // abstract method

}


public class twelfth_oops extends A {

    void mohan(){

        System.out.println("Mohan yae aapna abstraction topic complete ho gaya.");
    }

    public static void main(String[] args) {

        twelfth_oops obj = new twelfth_oops();

        obj.mohan();
        
    }
    
}
