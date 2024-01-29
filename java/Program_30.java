//Program-30 :- Write a program to implement insertion sort.
public class Program_30{
    public static void main(String args[]){
        int a[]={5,2,4,6,1,3,4};
        
        int key,i;
        for(int j=1;j<a.length;j++){
            key=a[j];
            i=j-1;
            while(i>=0 && a[i]>key){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
        System.out.println("Sorted array :");
        for (int element: a) {
            System.out.println(element);
        }
    }
}