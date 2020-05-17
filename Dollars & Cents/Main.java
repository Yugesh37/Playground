#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  double d1,c1,d2,c2,n1,n2,f,i;
  cin>>d1>>c1>>d2>>c2;
  double sum;
  n1=d1+c1*0.01;
  n2=d2+c2*0.01;
  sum=n1+n2;
  f=modf(sum,&i);
  cout<<i<<endl;
  cout<<f*100<<endl;
}