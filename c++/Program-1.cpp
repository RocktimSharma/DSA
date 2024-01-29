//Program-1 :- Write a program to check whether a number is od or even using bitwise operator.

#include<iostream>
using namespace std;


int main(){
 int num;


     cout<<"Enter Number \n";
     cin>>num;
     if((num &1) == 0){
         cout<<num<<" is even \n";
     }else{
         cout<<num<<" is odd \n";
     }

 
}

