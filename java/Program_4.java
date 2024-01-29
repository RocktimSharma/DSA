import java.util.Scanner;

//Program-4 :- Write a program to set i-th bit.
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter bit number");
        int i=sc.nextInt();
        int b=n^(1<<i);
        System.out.println("Result is "+b);
        
           
    }
}
