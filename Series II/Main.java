#include<iostream>
using namespace std;

int main()
{
  int m,count=0;
  float n=11;
  cin>>m;
  while(count<m)
  {
    cout<<n*n<<" ";
    n=n+4;
    count++;
  }
}