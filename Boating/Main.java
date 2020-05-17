#include<iostream>
using namespace std;
int main()
{
  int a,c,t;
  cin>>t;
  cin>>a>>c;
  if(75*a+30*c>t)
    cout<<"Boat will drow"<<endl;
  else
    cout<<"Boat is stable"<<endl;
}