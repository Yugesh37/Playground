#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  int bb;
 float b,r,of,rs,d,cr,rr;
  cin>>b>>r>>rs>>bb;
  cout<<b/6<<endl;
  d=fmod(bb,6);
  of=bb/6+(d/10);
  cout<<of<<endl;
  cr=rs/of;
  cout<<fixed<<setprecision(1)<<cr<<endl;
  rr=(6*r)/b;
  cout<<rr<<endl;
  if(cr>=rr)
  {
    cout<<"Eligible to Win"<<endl;
  }
  else
    cout<<"Not Eligible to Win"<<endl;
}