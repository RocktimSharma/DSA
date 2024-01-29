import java.util.Scanner;

//Program-1 :- Write a program to check whether a number is odd or even using bitwise operator.

class Program_1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if((n & 1)==0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
}