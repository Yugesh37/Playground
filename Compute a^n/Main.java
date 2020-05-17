#include<iostream>
using namespace std;

int power(int a,int n)
{
  
  if(n==0)
    return 1;
  n--;
  return a*power(a,n);
  
}

int main()
{
    int a, n;
    cin>>a>>n;
  cout<<"Enter the value of a \nEnter the value of n"<<endl;
    cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}