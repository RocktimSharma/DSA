//Program-32 :- Write a program to implement quick sort
class QuickSort{
    public void sort(int a[],int p,int r){
        if(p<r){
            int q=partition(a,p,r);
            sort(a,p,q-1);
            sort(a,q+1,r);
        }
    }
    public int partition(int a[],int p,int r){
        int x=a[r];
        int i=p-1;
        int temp;
        for(int j=p;j<=r-1;j++){
            if(a[j]<=x){
                i=i+1;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        
        
        }
        temp=a[i+1];
        a[i+1]=a[r];
        a[r]=temp;
    return i+1;
    }
}


public class Program_33 {
    
    public static void main(String args[]){
        int a[]={5,2,4,6,1,3,5};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(a,0, a.length-1);
        System.out.println("Sorted array :");
        for(int element:a){
            System.out.println(element);
        }
    }
}
