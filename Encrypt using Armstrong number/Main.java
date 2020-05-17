#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int i,z,sum=0,org;
  int arr[7];
  org=n;
  i=0;
    while(n>0)
    {
   		
     arr[i]=n%10;
     i++;
      	n=n/10;
    }
  z=i;
  
  for(int i =0 ; i<z;i++){
      
     
        sum+=power(arr[i],z);
 
  }
  if(org==sum)
    return 1;
      
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}