//Program-31 :- Write a program to implement slection sort.
public class Program_31{
    public static void main(String args[]){
        int arr[]={0,80,4,6,1,3,9,32,1};
        int key,idx;
        for(int j=0; j<arr.length;j++ ){
            idx=j;
            key=arr[j];
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]<key){
                    key=arr[i];
                    idx=i;
                }
               
            }
            arr[idx]=arr[j];
            arr[j]=key;

            
        }
        System.out.println("Sorted array :");
        for (int element: arr) {
            System.out.println(element);
        }

    }
}