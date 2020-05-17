#include<iostream>
using namespace std;

int main()
{
  int m,count=0;
  int n=1;
  cin>>m;
  while(count<m)
  {
    if(n%2==0)
    {
      cout<<(n*n)-2<<" ";
      n++;
    }
    else
    {
      cout<<(n*n)-1<<" ";
      n++;
    }
    count++;
  }
}