#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;

struct College
{
    char name[100];
  char city[2100];
  int establishmentYear;
    float passPercentage;
};

int main() 
{
     struct College S1[1000];
  struct College t;
  int i,j,n;
    cout << "Enter the number of colleges" << endl;
    cin>>n;
  for(int i=0;i<n;i++){
  cout<<"Enter the details of college "<<i+1<<endl;
  cout<<"Enter name"<<endl;
    cin >> S1[i].name;
    cout << "Enter city"<<endl;
    cin >> S1[i].city;
    cout << "Enter year of establishment"<<endl;
    cin >> S1[i].establishmentYear;
	cout<<"Enter pass percentage"<<endl;
  	cin>>S1[i].passPercentage;
  }
  
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(strcmp(S1[i].name,S1[j].name)>0)
      {
        t=S1[i];
        S1[i]=S1[j];
        S1[j]=t;
      }
    }
  }
  
  
    cout << "Details of colleges" << endl;
  for(int i=0;i<n;i++){
  	cout<<"College:"<<i+1<<endl;
    cout << "Name:" << S1[i].name << endl;
    cout << "City:" << S1[i].city << endl;
   cout << "Year of establishment:" << S1[i].establishmentYear << endl;
 
  cout << "Pass percentage:" <<S1[i].passPercentage << endl;
  }
    return 0;
}