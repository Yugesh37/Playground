#include<iostream>
using namespace std;
int main()
{
  int en,tn,n,i,sum;
  cin>>en>>tn;
  n=en+tn;
  sum=0;
  i=1;
  while(i<=n)
  {
    if(n%i==0)
      sum=sum+i;
    i=i+1;
  }
  if((sum-n)==n)
    cout<<"They can read the message"<<endl;
  else
    cout<<"They can't read the message"<<endl;
}