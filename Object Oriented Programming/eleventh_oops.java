// 2).Run Time Polymorphism / Method Overrirding


class A{

    void mohan(){

        System.out.println("Mohan is a Good Boy");
    }
}


public class eleventh_oops extends A {


    @Override
    void mohan(){

        System.out.println("Mohan is a bad boy");
    }


    public static void main(String[] args) {


        eleventh_oops obj = new eleventh_oops();

        
        
        
    }
    
}
