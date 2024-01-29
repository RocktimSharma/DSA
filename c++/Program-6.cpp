//Program-6     :- Write a program to find the number of bits we need to change to convert a to b.

#include<iostream>

using namespace std;

int main(){

    int a,b,num,c=0;
    cin>>a>>b;

    num=a^b;
    
    while(num!=0){
        c++;
        num=num&(num-1);
    }

    cout<<c<<"\n";

    
    return 0;
}