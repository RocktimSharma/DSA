
//Write a program to find two none repeating elements where every element repeats twice.
public class Program_8{
    public static void main(String arg[]){
    int arr[]={5,4,4,1,3,2,5,2};
    int res=0,odd=0,num;
    for(int i=0;i<8;i++){
        if((arr[i]&1)!=0){
            odd=odd^arr[i];
        }
        res=res^arr[i];
    }

        num=odd^res;
        res=res^num;
        System.out.println(num);
        System.out.println(res);
    }
    

}