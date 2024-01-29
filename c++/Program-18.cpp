//Program-18    :- Write a program to check for pallindrome string using recursion.

#include<iostream>

using namespace std;
bool checkPalindrome(char str[], int s,int e){
    if(s==e){
        return true;
    }

    if(str[s]!=str[e]){
        return false;
    }

    return checkPalindrome(str,s+1,e-1);

}

int main(){
  char str[]="rocktim";
  
  cout<<checkPalindrome(str,0,6)<<"\n";

  return 0;
}