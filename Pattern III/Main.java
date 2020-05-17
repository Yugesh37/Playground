#include<iostream>
using namespace std;
int main()
{
 int n,i,j,count=1;
 cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=1;j<count;j++)
    {
      cout<<count<<"*";
    }
    cout<<count;
    cout<<endl;
      count++;
  }
  count--;
  for(i=0;i<n;i++)
  {
      for(j=count;j>1;j--)
      {
          cout<<count<<"*";
      }
       cout<<count;
      cout<<endl;
      count--;
  }
}