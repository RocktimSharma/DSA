//Program 2: Write a program to swap two numbers using bitwise operator.
import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);


    }
}
