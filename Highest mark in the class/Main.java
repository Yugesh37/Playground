#include<iostream>
using namespace std;
int main()
{
  int size;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
    cin>>arr[i];
     int temp=arr[0];
  for(int i=0;i<size;i++){

    if(temp<arr[i])
    {
      temp=arr[i];
    }
  }
  cout<<temp;
  
}
    