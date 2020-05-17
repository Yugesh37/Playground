#include<iostream>
using namespace std;

int main()
{
    int x,y,z,small,ans;
  cin>>x>>y>>z>>ans;
  int gcd;
    
    if(x<y&&x<z)
       small=x;
  else if(y<x&&y<z)
    small=y;
  else 
    small=z;
    while(small>0){
    if(x%small==0 && y%small==0 && z%small==0)
    {gcd=small;
      break;}
      small--;
    }
  if(gcd==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
} 