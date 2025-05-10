// 5). Multiple Inheritance  (Use through Interface)

// Interface - : Two Objects meets with each other. Like - Tv and remote

// Note 1 : Interface does not define and specifiy the body.

// Note 2: Interface sae 100% Inheritance achieve hota hai.


interface parents1{

    public void show();


}


interface parents2{

    public void show2();
}

public class ninth_oops implements parents1,parents2 {


    public void show(){

        System.out.println("Parents 1");
    }

    public void show2(){

        System.out.println("Parents 2");
    }

    public void show3(){

        System.out.println("Beta");
    }



    public static void main(String[] args) {


        ninth_oops obj = new ninth_oops();

        obj.show();
        obj.show2();
        obj.show3();


        
    }
    
}
