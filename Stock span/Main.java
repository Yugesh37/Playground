#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp=1,temp2=1;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<temp2<<endl;
  for(int i=0 ; i<n-1;i++)
  {
    if(a[i+1]<a[i])
    cout<<temp2<<endl;
    if(a[i+1]>a[i] && i<n-1)
    {
      cout<<temp*2<<endl;
      temp++;
      
    }
    
  }

}