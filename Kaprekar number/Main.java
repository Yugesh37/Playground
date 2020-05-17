#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;

  cin>>n;
  int org=n*n;
  int orgp=org;
  while(org!=0)
  {
    
    org/=10;
    count++;
  }
 count=count/2;
 int temp=(pow(10,count));
int orgp1 = orgp%temp;
int orgp2 =orgp/temp;
if(n==orgp1+orgp2)
cout<<"Kaprekar Number";
else
cout<<"Not a Kaprekar Number";

 
}