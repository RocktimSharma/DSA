//Program-12    :- Write a program to find the GCD of two number.

#include<iostream>

using namespace std;

int gcd(int x, int y);

int main(){
    int num1,num2;
    cin>>num1>>num2;
    
    int res=gcd(num1,num2);

    cout<<res<<"\n";

    return 0;
}

int gcd(int x, int y){
 
   if(y==0){
       return x;
   }else{
       return gcd(y,x%y);
   }

   

}