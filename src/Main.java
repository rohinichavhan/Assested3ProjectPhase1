//Writing a program in Java to demonstrate custom exceptions
class MyException1 extends Exception 
{ 
    public MyException1(String s) 
    { 
        super(s); 
    } 
} 
public class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException1("temp"); 
        } 
        catch (MyException1 ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
