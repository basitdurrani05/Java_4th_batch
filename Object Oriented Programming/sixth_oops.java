// 2). Multi-level Inheritance



class A{


    void show(){

        System.out.println("Dadajii");
    }

    
}


class B extends A{ 

    

    void show2(){

        System.out.println("Papajii");
    }
}

public class sixth_oops extends B{    // Mohan Basit Tanishq Jeevesh


    void show3(){

        System.out.println("Beta");
    }




    public static void main(String[] args) {

        sixth_oops obj = new sixth_oops();

        obj.show();
        obj.show2();
        obj.show3();




        
    }
    
}
