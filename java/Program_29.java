public class Program_29 {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         } 
       
        
  
    }  
    public static void main(String[] args) {  
        int a[]={5,2,4,6,1,3,4}; 
        int b=4;         
                System.out.println("Array Before Bubble Sort");  
                for(int element : a){  
                        System.out.print(element + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(a);
                 
                System.out.println("Array After Sorting");  
                for(int element : a){  
                    System.out.print(element + " ");  
            }  

            System.out.println(b);
   
        }  
}  