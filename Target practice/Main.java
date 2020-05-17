#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,count=0,t;
  cin>>n;
  do{
    cin>>t;
    if(t==n){
      count++;
      break;}
  sum+=t;
    count++;
  }while(sum<n);
  cout<<"The number of turns is "<<count;
}