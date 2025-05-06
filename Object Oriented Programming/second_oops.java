// Getter and Setter In Java

// Getter - Read the Value
// Setter - Set the value

public class second_oops {

    // private String name;
    // private int number;

    // public void setname(String a){    

    //     name =a;   // Private  + public = public 
    // }


    // public String getname(){

    //     return name;
    // }


    // public void setnumber(int b){

    //     number = b;  // Private  + public = public 
    // }


    // public int getnumber(){

    //     return number;
    // }


    private String fname;
    private String lname;


    public void setfname(String a){

        fname = a;
    }


    public String getfname(){

        return fname;
    } 


    public void setlname(String b){

        lname= b;
    }

    public String getlname(){

        return lname;
    }


    public static void main(String[] args) {


        second_oops sc = new second_oops();


        // sc.setname("Mohan");
        // sc.setnumber(32);


        // System.out.println(sc.getname());
        // System.out.println(sc.getnumber());


          sc.setfname("First Name : "+"Mohan");
          sc.setlname("Last Name : "+"Kushwah");



        System.out.println(sc.getfname());
        System.out.println(sc.getlname());












      
        


    }
    
}
