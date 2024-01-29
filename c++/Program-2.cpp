//Program-2  :- Write a program to swap two numbers using bitwise operator.

#include<iostream>
using namespace std;

int main(){
    int a,b;
    
    cin>>a>>b;
    cout<<"Before Swaping a= "<<a<<" b= "<<b<<"\n";

    //Let a=3, b=7

    a=a^b;  //011^111=100, a=4
    b=a^b;  //100^111=011, b=3
    a=a^b;  //100^011=111, a=7

    cout<<"After Swaping a= "<<a<<" b= "<<b<<"\n";


    return 0;
}