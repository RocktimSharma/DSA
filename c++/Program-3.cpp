//Program-3     :- Write a program to find the i th bit.

#include<iostream>
using namespace std;

int main(){
    int num,pos;
    cin>>num>>pos;
    if((num&(1<<pos))==0){
        cout<<pos<<" bit is 0 \n";
    }else{
        cout<<pos<<" bit is 1 \n";
    }
    return 0;
}