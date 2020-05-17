#include <iostream>
#include<math.h>
using namespace std;

int main()
{
  int n, m,req,x;
  cin>>m>>n>>req;
  x=pow(m,n);
  if(req<=x)
    cout<<"Doctor, you can proceed with your experiment.";
    else
      cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}