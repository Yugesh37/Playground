#include<iostream>
using namespace std;
int main()
{
  float mi,x;
  int l,d;
  cin>>mi>>l>>d;
  x=mi*l;
  if(x<=d)
    cout<<"Cannot reach"<<endl;
  else
    cout<<"Can reach"<<endl;
}