#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int ni;
  float ht;
  cin>>ni>>ht;
  if(ni==2)
    cout<<fixed<<setprecision(2)<<ht*1.5<<endl;
  else if(ni==3)
    cout<<fixed<<setprecision(2)<<ht*2<<endl;
  else
    cout<<"Number of items is more"<<endl;
}