// 2).Run Time Polymorphism / Method Overrirding


class A{   //  Mohan Home

    void mohan(){

        System.out.println("Mohan is a Good Boy");
    }
}


public class eleventh_oops extends A {   // Mohan college 


    @Override   // annontation
    void mohan(){

        System.out.println("Mohan is a bad boy");
    }


    public static void main(String[] args) {


        // eleventh_oops obj = new eleventh_oops();

        // A obj = new A();

        // obj.mohan();

        
        
        
    }
    
}
