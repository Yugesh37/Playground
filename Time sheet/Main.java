#include<iostream>
using namespace std;
int main()
{
  int a[7],i,s,sb,sab;
  for(i=0;i<7;i++)
  {
    cin>>a[i];
  }
  s=0;
  for(i=1;i<6;i++)
  {
    if(a[i]<=8)
      s=s+100*a[i];
    else
      s=s+100*a[i]+((a[i]-8)*15);
  }
  sb=100*a[0];
  sab=100*a[6];
  {
    if(a[0]<=8)
   	s=s+sb+sb/2;
  else
    s=s+sb+sb/2+((a[0]-8)*15);
  }
  {
    if(a[6]<=8)
      s=s+sab+sab/4;
    else
      s=s+sab+sab/4+((a[6]-8)*15);
  }
  cout<<s<<endl;
}