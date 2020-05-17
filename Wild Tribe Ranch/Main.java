#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  if(x>y)
    cout<<"Yes, you can enter."<<endl;
  else if(x==y)
    cout<<"Yes, you can enter. Kindly use a rope."<<endl;
  else
    cout<<"Sorry, you can't enter"<<endl;
}