// Method overloading   - same name but different arguments

// Naam ek kaam alag alag


public class eleventh {

    public static void mohan(String a){

        System.out.println("Mohan Company :  "+a);
    }


    public static void mohan(String a,String b){

        System.out.println("Mohan Home : "+a+" "+b);
    }

    public static void  mohan(String a,String b,String c){

        System.out.println("Mohan College : "+a+" "+b+" "+c);
    }



    public static void main(String[] args) {

        mohan("Software Engineer");
        mohan("Brother","Son");
        mohan("Student","Friend","BestFriend");
        
    }
    
}
