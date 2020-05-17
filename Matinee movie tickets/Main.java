#include<iostream>
using namespace std;
int main()
{
  int a;
  float t;
  cin>>a>>t;
  if(a>13 && t>12.00)
    cout<<"$5.00"<<endl;
  else if(a>13 && t<12.00)
    cout<<"$8.00"<<endl;
  else if(a<13 && t>12.00)
    cout<<"$2.00"<<endl;
  else
    cout<<"$4.00"<<endl;
}