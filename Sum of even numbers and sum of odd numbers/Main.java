#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp=0,temp2=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  for(int i=0 ; i<n;i++)
  {
    if(a[i]%2==0)
    {
      temp+=a[i];
      
    }
    else
      temp2+=a[i];
  }

cout<<"The sum of the even numbers in the array is "<<temp<<endl;
cout<<"The sum of the odd numbers in the array is "<<temp2;
}