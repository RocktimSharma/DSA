//Program-10    :- Write a program to find the number of tailing zeros in factorial.

#include<iostream>

using namespace std;

int main(){
    int num,res=0;
    cin>>num;
    for(int i=5;i<=num;i=i*5){
        res=res+(num/i);
    }   

    cout<<res<<"\n";
    return 0;
}