//Program-11    :- Sieve of Eratosthenes.

#include<iostream>
#include <vector>
using namespace std;

bool *sieveOfEratosthenis(int n);

int main(){
    int num=10;
    bool *p;
    std::vector<bool> isPrime;

    p=sieveOfEratosthenis(num);

    for(int i=0;i<num+1;i++){
        std::cout << std::boolalpha;  
        std::cout<<i<<"\t"<<*(p+i)<<"\n";
    }
    
}

bool *sieveOfEratosthenis(int n){

    bool isPrime[n+1];
    std::fill_n(isPrime, n+1, true);
    isPrime[0]=false;
    isPrime[1]=false;

    for (int i=2;i*i<=n;i++){
        for(int j=2*i;j<=n;j+=i){
            isPrime[j]=false;
        }
    }

    

    return isPrime;

}



