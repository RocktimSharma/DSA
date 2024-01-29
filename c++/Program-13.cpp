//Program-13    :- Write a program to compute answer in modulo.
/*
 a^b=(a^2)^(b/2), if b is even
 a^b=a.a^(b-1), if b is odd,
*/
#include<iostream>

using namespace std;

long fastPower(long a, long b,int n){
    long res=1;
    
    while(b>0){
        if((b&1)!=0){
            res=(res * a % n)%n;
        }

        a=(a % n * a % n)%n;
        b=b>>1;
    }
    return res;
}


int main(){
    long a=3978432,b=5;
    int n=1000000007;
 //   cin>>a>>b>>n;
    cout<<fastPower(a,b,n)<<"\n";
    return 0;
}