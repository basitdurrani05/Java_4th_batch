// 4). Hybrid Inheritance

// Parents or child Infinite


class parents{

    void show(){

        System.out.println("Parents");
    }
}



public class eighth_oops extends parents {    // eighth - oops - child class


    void show2(){

        System.out.println("Son and Daughter");
    }



    public static void main(String[] args) {


        eighth_oops obj = new eighth_oops();

        obj.show();
        obj.show2();
        
    }
    
}
