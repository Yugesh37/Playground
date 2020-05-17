#include<iostream>
using namespace std;
int main()
{
 int n,c;
  cin>>n;
  c=0;
  do
  {
    n=n/10;
    c++;
  }
  while(n!=0);
  cout<<c;
}