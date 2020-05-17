#include<iostream>
using namespace std;
int main()
{
 int n,i,j,m,helper=0,count=1;
 cin>>n;
  m=n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<count;j++)
    {
      cout<<m+helper;
    }
    cout<<"\n";
      helper++;
      count++;
  }
  helper--;
  count--;
  for(i=0;i<4;i++)
  {
      for(j=count;j>0;j--)
      {
          cout<<m+helper;
      }
      cout<<endl;
      helper--;
      count--;
  }
}