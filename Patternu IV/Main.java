#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  cin>>n;
  int help=1;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(int j=0;j<n-1;j++)
        cout<<help;
      help++;
      cout<<help<<endl;
    }
    else{
      cout<<help+1;
       for(int j=0;j<n-1;j++)
        cout<<help;
      cout<<endl;
      help++;
      
    }
  }
    return 0;
}