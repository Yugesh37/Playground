#include<iostream>
using namespace std;
#include<string>

int main()
{
  string n;
  getline(cin,n);
  int j = n.length();
  cout<<"The number of letters in the name is "<<j;
}