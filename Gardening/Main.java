#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if((n>=(r+1))&&(n<=2*r))
    cout<<"It is a mango tree"<<endl;
  else if((n>=((c-2)*r+1))&&(n<=((c-1)*r)))
    cout<<"It is a mango tree"<<endl;
  else
    cout<<"It is not a mango tree"<<endl;
}