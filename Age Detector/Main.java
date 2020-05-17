#include<iostream>
using namespace std;
int main()
{
  int by,cy;
  cin>>by>>cy;
  if(by<cy)
    cout<<cy-by<<endl;
  else if((cy==00)||(by>cy))
    cout<<(2000+cy)-(1900+by)<<endl;
}