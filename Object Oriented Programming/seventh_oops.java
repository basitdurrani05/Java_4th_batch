// 3). Hierarchical Inheritance

// 1 Parnet Class and 2 child class


class parents{

    void show(){

        System.out.println("Parents : Mummy || Papa");
    }
}

class beta extends parents{

    void show2(){

        System.out.println("Beta");
    }
}

public class seventh_oops extends beta {  // Seventh - oops : Beti

    void show3(){

        System.out.println("Beti");
    }

    public static void main(String[] args) {

        
        seventh_oops obj = new seventh_oops();

        obj.show();
        obj.show2();
        obj.show3();
        

    }
    
}
