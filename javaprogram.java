import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        try{
            int result=dividend/divisor;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception cannot divide by zero");
        }
    }
}


FINALLYALWAYSEXECUTES

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        try{
            int result=dividend/divisor;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }finally{
            System.out.println("finally always executes");
        }
    }
}


STRING OUTOF BOUNDS EXCEPTION

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int index=sc.nextInt();
        try{
            char ch=str.charAt(index);
            System.out.println(ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("String index range error");
        }
    }
}
