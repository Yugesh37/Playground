#include<iostream>
using namespace std;

int main()
{
  int m,count=0;
  float n=0.5;
  cin>>m;
  n=0.5;
  while(count<m)
  {
    cout<<n<<" ";
    n=n*3;
    count++;
  }
}