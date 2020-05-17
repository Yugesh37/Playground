#include<iostream>
using namespace std;
int main()
{
  int sn,en,j,sum,n,i;
  cin>>sn>>en;

   for(i=sn;i<=en;i++)
   { 
     n=i;
       j=1;
        sum=0;
  	while(j<=n)
  	{
   	 if(n%j==0)
     {
       sum=sum+j;
     }
      j++;
    }
    if((sum-n)==n)
    {
      cout<<n<<" ";
    }
  }
}