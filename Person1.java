// java program with function

public class Person1 {
        // variables 
    static String name = "Yadnesh";
    static int age = 24;
    
    public static void displayPersonDetail(){
        System.out.println("Welcome");
        System.out.println(name);
        System.out.println(age);
    
        System.out.println("Welcome " + name + " " + age);
    }
    
    public static void main(String[] args){
        displayPersonDetail();
    }

}
