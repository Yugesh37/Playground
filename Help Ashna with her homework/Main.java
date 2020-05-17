#include<iostream>
int main()
{
  int a,b,A,S,M,D,R;
  std::cin>>a;
  std::cin>>b;
  A=a+b;
  S=a-b;
  M=a*b;
  D=a/b;
  R=a%b;
  std::cout<<"a+b="<<A;
  std::cout<<"\na-b="<<S;
  std::cout<<"\na*b="<<M;
  std::cout<<"\na/b="<<D;
  std::cout<<"\na%b="<<R;
}