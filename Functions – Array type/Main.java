#include<iostream>
using namespace std;
int main()
{
  
   
  cout<<"Enter the number of elements in the array"<<endl;
   cout<<"Enter the elements in the array"<<endl;
  
  int n,even=0,odd=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
   
  for(int i=0;i<n;i++)
  {
		if(a[i]%2==0)
        {
          even++;
        }
    else{
      odd++;
    }
  }
  if(odd==n)
  {
    cout<<"The array is Odd";
  }
  else if(even==n)
    cout<<"The array is Even";
  else
    cout<<"The array is Mixed";
    
}