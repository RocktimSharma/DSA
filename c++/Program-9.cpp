//Program-9     :- Write a program to find the only non repeating element where every element repeats thrice.

#include<iostream>

using namespace std;
int main() {
   
   int n,num,j;
   int set[64]={0}; // maximum bits
   cin>>n;
   for(int i=0;i<n;i++){
       cin>>num;
       j=0;

       while(num){
           set[j]+=(num&1);
           num=num>>1;
           j++;
       }
   }
int ans=0,p=1;
for(int i=0;i<n;i++){

    ans+=(set[i]%3)*p;
    p=p*2;
}
cout<<ans<<endl;

}