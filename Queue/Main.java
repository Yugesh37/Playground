#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here.
  int n,m,net=0,bus=0;
   std::cin>>n>>m;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
 
  for(int i=0;i<n;i++)
  {
    
    if((arr[i] + arr[i+1])<=m && i<n-1)
    {
      i++;
    }
    bus++;
  }
  
  if(n==3)
  std::cout<<bus+1;
  else
     std::cout<<bus;
}
  