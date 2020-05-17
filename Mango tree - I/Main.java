#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(n>=1 && n<=c)
    cout<<"Yes"<<endl;
  else if(n%c==1 || n%c==0)
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
}