#include<iostream>
using namespace std;

int main()
{
  int m,count=0,helper=1;
  int n=6;
  cin>>m;
  while(count<m)
  {
    cout<<n<<" ";
    n=n+5*helper;
    helper++;
    count++;
  }
}