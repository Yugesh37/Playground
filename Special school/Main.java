#include<iostream>
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  getline(cin,b);
  char temp;
  
  int j = a.length()-1;
  int i=0;
  while(i<j)
  {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
 	j--;
    i++;
  }
  if(a==b)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}