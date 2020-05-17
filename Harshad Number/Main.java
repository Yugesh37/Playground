#include<iostream>
using namespace std;
int main()
{
int n,sum=0,m,p;      
cin>>n;  
  p=n;
while(p>0)    
	{    
	 m=p%10;    
	 sum=sum+m;    
	 p=p/10;    
	} 
  if(n%sum==0)
    cout<<"Harshad Number"<<endl;
  else
    cout<<"Not Harshad Number"<<endl;
}