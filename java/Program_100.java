import java.util.Scanner;
class Program{
    public void leftShift(int a[],int p,int n){
        int temp[]=new int[n];
        int idx=0;
        for(int i=p;i<n;i++){
            temp[idx]=a[i];
            idx++;
        }

        for(int i=0;i<p;i++){
            temp[idx]=a[i];
            idx++;
        }


        for(int i=0;i<n;i++){
            a[i]=temp[i];

        }
    }

    public void  rightShift(int a[],int p,int n){
        int temp[]=new int[n];
        int idx=0;
        for(int i=n-p;i<n;i++){
            temp[idx]=a[i];
            idx++;
        }

        for(int i=0;i<n-p;i++){
            temp[idx]=a[i];
            idx++;
        }


        for(int i=0;i<n;i++){
            a[i]=temp[i];

        }
    }
}
public class Program_100 {

    
    public static void main(String[] args) {
        int p,d;
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        p=sc.nextInt();
        d=sc.nextInt();
        Program program=new  Program();
        switch(d){
            case 0:
                program.leftShift(a,p,n);
                break;
            case 1:
                program.rightShift(a,p,n);
                break;
        }

        for(int element: a){
            System.out.print(" "+element);
        }

    }
}
