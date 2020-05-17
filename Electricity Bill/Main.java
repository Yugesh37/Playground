#include<iostream>
using namespace std;
int main()
{
  int i,o;
  cin>>i;
  if(i<=200)
  {
    o=0.5*i;
    cout<<"Rs."<<o<<endl;
  }
   else if(i<=400)
  {
    o=0.65*i+100;
    cout<<"Rs."<<o<<endl;
  }
  else if(i<=600)
  {
    o=0.80*i+200;
    cout<<"Rs."<<o<<endl;
  }
  if(i>600)
  { 
    o=1.25*i+425;
    cout<<"Rs."<<o<<endl;
  }

}