//Program-8     :- Write a program to find two none repeating elements where every element repeats twice.

#include<iostream>

using namespace std;

int main(){
    int arr[]={5,4,4,1,3,1,5,2};
    int res=0,even=0,odd=0,num;
    for(int i=0;i<8;i++){
        if((arr[i]&1)!=0){
            even=even^arr[i];
        }
        res=res^arr[i];
    }

        num=even^res;
        res=res^num;
    
   
   

    cout<<res<<" and "<<num<<"\n";
    
    return 0;
}