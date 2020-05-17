#include<iostream>
using namespace std;
int main()
{
 int a,i=0;
  float s=0.0;

do
{
    cin>>a;
   if(a>0)
   {
     if(a%2==0)
     {
       s=s-0.5;
     }
     else
     {
       s=s+1;
       i++;
     }
   }
   else
   {
     s=s-1.0;
     break;
   }
 }while(i<3);
  cout<<s;
}