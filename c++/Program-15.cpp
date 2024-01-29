//Program-15    :- Write a program to find a^b using recursion.

#include<iostream>

using namespace std;

int power(int a,int b){

    if(b==1){
        return a;
    }

    return a*power(a,b-1);

}

int main(){
    int a=5,b=3;
    cout<<power(a,b)<<"\n";
    return 0;
}