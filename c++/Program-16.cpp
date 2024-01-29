//Program-16    :- Write a program to find the no. of ways ina n x m matrix.

#include<iostream>

using namespace std;

int move(int n,int m){
    if(n==1 || m==1){
        return 1;
    }
    return move(n-1,m)+move(n,m-1);

}

int main(){
    int n=3,m=3;
    cout<<move(n,m)<<"\n";
    return 0;
}