#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int* arr;
  arr = new int[n];
  for(int i=0 ; i<n ;i++)
  {
    cin>>arr[i];
  }
  int f,m;
  f=0;
  m=0;
   for(int i=0 ; i<n ;i++)
   {
     
     if(arr[i]%2==0)
       f++;
     else{ m++;}
   }
  cout<<m<<endl;
  cout<<f;
  return 0;
}