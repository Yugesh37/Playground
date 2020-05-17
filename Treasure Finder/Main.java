#include<iostream>
using namespace std;
 int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 

int main()
{
 int n1,n2,n3,g1,g2,g3,g4,g5,g6;
  cin>>n1>>n2>>n3;
  if((n1<n2 && n2<n3) || (n3<n2 && n2<n1))
  {
    cout<<"The treasure is in box which has number "<<n2<<endl;
    g1=gcd(n3,n2);
    g2=gcd(g1,n1);
    cout<<"The code to open the box is "<<g2<<endl;
  }
  else if((n1<n3 && n3<n2) || (n2<n3 && n3<n1))
  {
    cout<<"The treasure is in box which has number "<<n3<<endl;
    g3=gcd(n2,n3);
    g4=gcd(g3,n1);
    cout<<"The code to open the box is "<<g4<<endl;
  }
  else if((n2<n1 && n1<n3) || (n3<n1 && n1<n2))
  {
    cout<<"The treasure is in box which has number "<<n1<<endl;
    g5=gcd(n1,n3);
    g6=gcd(g5,n2);
    cout<<"The code to open the box is "<<g6<<endl;
  }
}
 