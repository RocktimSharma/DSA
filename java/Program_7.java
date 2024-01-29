public class Program_7 {
    public static void main(String args[]){
  int[] arr={2,3,4,5,5,4,2};
  int res=0;
  for(int i=0;i<arr.length;i++){
      res=res^arr[i];
  }
  System.out.println(res);
    }
}