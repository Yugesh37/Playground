#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int pa,i,y;
  float intrest,amount,discount,sett;
  cin>>pa>>i>>y;
  intrest=(pa*i*y)/100;
  amount=intrest+pa;
  discount=intrest*0.02;
  sett=amount-discount;
  
  cout<<intrest<<endl;
  cout<<amount<<endl;
  cout<<discount<<endl;
  cout<<sett<<endl;
  return 0;
}