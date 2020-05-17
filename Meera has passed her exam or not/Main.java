#include<iostream>
using namespace std;
int main()
{
  int size;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
    cin>>arr[i];
     int temp,f;
  cin>>temp;
  for(int i=0;i<size;i++){

    if(temp==arr[i])
    {
      f=1;
      break;
    }
    
  }
  
  if(f==1)
    cout<<"She passed her exam";
  else cout<<"She failed";
}
    