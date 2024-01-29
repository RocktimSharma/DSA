//Program-7     :- Write a program to find the only non repeating element in a array where every element repeats twice.

#include<iostream>
using namespace std;

int main(){
     int arr[]={2,4,3,5,4,2,5};
     int res=0;
     for(int i=0;i<7;i++){
         res=res^arr[i];
     }

     cout<<res<<"\n";


    return 0;
}