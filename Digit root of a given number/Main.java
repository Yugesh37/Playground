#include<iostream>
using namespace std;

int digit(int n)
{
  
  if(n==0)
    return n;
  
  int j=n%10;
  n=n/10;
  return j+digit(n);
  
}

int main()
{
    int  n;
    cin>>n;
    int k = digit(n);
    if(k>9)
    cout<<digit(k);
}