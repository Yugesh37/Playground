#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  cout<<"Enter the number of elements in the array"<<endl;
  cout<<"Enter the elements in the array"<<endl;
  cout<<"Enter the location where you wish to insert an element"<<endl;
   
   
  
  
  int n,value,loc;
  cin>>n;
  int a[n+1];
  for(int i=0;i<n;i++)
    cin>>a[i];
   
    
cin>>loc;
  if(loc>=n+1){
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert"<<endl;
  cin>>value;
cout<<"Array after insertion is"<<endl;
  loc=loc-1;
int  i=n-1;

 while(i>=loc)
  {
      a[i+1]=a[i];
     
      i--;
 }
 a[loc]=value;

  for(int i=0;i<n+1;i++)
  {
    cout<<a[i]<<endl;
  }
}