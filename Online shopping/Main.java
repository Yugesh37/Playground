#include<iostream>
using namespace std;
int main()
{
  int p1,d1,s1,p2,d2,s2,p3,d3,s3,f,s,a;
  cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
  f=p1-(d1*p1*0.01)+s1;
  cout<<"In Flipkart Rs."<<f<<endl;
  s=p2-(d2*p2*0.01)+s2;
  cout<<"In Snapdeal Rs."<<s<<endl;
  a=p3-(d3*p3*0.01)+s3;
  cout<<"In Amazon Rs."<<a<<endl;
  if(f<=s && s<=a)
    cout<<"He will prefer Flipkart"<<endl;
  else if(s<=f && f<=a)
    cout<<"He will prefer Snapdeal"<<endl;
  else
    cout<<"He will prefer Amazon"<<endl;
}