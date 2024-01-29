
//Program-32 :-  Write a program to implement merge sort
class MergeSort{

    void merge(int a[],int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;++i){
            L[i]=a[p+i];
        }
        for(int j=0;j<n2;++j){
            R[j]=a[q+1+j];
        }
        int i=0,j=0,k;
        for(k=p;k<r;k++){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i=i+1;

            }else{
                a[k]=R[j];
                j=j+1;
            }
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }



    }
    void sort(int a[],int l,int r){
        if(l<r){
            int m=(r+l)/2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
}

public class Program_32 {

   public static void main(String args[]){
    int a[]={5,2,4,6,1,3,7};
    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(a, 0, a.length - 1);
    System.out.println("Sorted array :");
    for(int element:a){
        System.out.println(element);
    }
   } 
}
