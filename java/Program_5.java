//Program-5 :- Write a program to clear the i-th bit.
import java.util.Scanner;
public class Program_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter bit number");
        int i=sc.nextInt();
        int b=n&(~(1<<i));
        System.out.println("Result is "+b);
    }
}
