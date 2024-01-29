//Program-34 :- Write a program to implement heap sort

class HeapSort{
    public int parent(int i){
        return i/2;
    }

    public int left(int i){
        return 2*i+1;
    }

    public int right(int i){
        return 2*i+2;
    }

    public void heapify(int a[],int n,int i){
        int l=left(i);
        int r=right(i);
        int largest=i;
        if(l<n && a[l]>a[largest]){
            largest=l;

        }
        if(r<n && a[r]>a[largest]){
            largest=r;
        }
        if (largest!=i){
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n, largest);
        }

    }
    public void heapSort(int a[],int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n, i);
        }

        for(int i=n-1;i>=0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(a,i,0);
        }
    }
}



public class Program_34 {
    public static void main(String args[] ){
        int a[]={5,2,4,6,3,1,100,32};
        HeapSort hs=new HeapSort();
       
        hs.heapSort(a,a.length);
        System.out.println("Sorted array :");
        for(int element:a){
            System.out.println(element);
        }
    }
}
