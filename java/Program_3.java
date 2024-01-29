import java.util.Scanner;

//Program-3 :-  Write a program to find the i-th bit.
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter bit number");
        int i=sc.nextInt();
        
        if((n&(1<<i))==0){
            System.out.println("The "+i+"th bit is 0");
        }else{
            System.out.println("The "+i+"th bit is 1");
        }

    }
}
