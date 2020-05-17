#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int x,y,h,sq;
  std::cin>>x;
  std::cin>>y;
  h=((3-x)*(3-x)+(4-y)*(4-y));
  sq=sqrt(h);
  std::cout<<sq;
}