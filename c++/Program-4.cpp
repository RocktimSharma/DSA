//Program-4     :- Write a program to set i ith bit.
#include<iostream>

using namespace std;

int main(){
    int num,pos;
    cin>>num>>pos;
    num=(num^(1<<pos));
    cout<<num<<"\n";
    return 0;

}