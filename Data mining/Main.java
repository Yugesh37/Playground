#include<iostream>
using namespace std;
int main()
{
  int n,count=0,sume=0,sumo=0;
  int arr[20];
  cin>>n;
  while(n!=0)
  {
    arr[count++]=n%10;
    n=n/10;
  }
  for(int i=0;i<count;i++)
  {
    if(arr[i]%2==0)
    {
      sume+=arr[i];
    }
    else{
    sumo+=arr[i];
    }
  }
  if(sume==sumo)
    cout<<"Yes";
  else
    cout<<"No";
}