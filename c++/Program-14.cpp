//Program-14    :- Write a program to find the sum of N natural number using recursion.

#include<iostream>

using namespace std;

int sum(int n){
    if(n==1){
        return 1;
    }

    return n+sum(n-1);

    
}

int main(){
    int n=5;
    cout<<sum(n)<<"\n";

    return 0;
}