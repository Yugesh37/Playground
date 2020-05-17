#include<iostream>
using namespace std;
int main()
{
  string d;
  int ra;
  cin>>d>>ra;
  if(d=="front")
  {
    if(ra==1)
    cout<<"Left Handed"<<endl;
    else
    cout<<"Right Handed"<<endl;
  }
   else
   {
     if(ra==1)
     cout<<"Right Handed"<<endl;
     else
       cout<<"Left Handed"<<endl;
   }
}