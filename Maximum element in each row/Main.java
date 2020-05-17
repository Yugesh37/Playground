#include<iostream>
using namespace std;

int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  
for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
    }

  for(int i = 0; i < r; i++){
    		int maxc=a[i][0];
        for(int j = 0; j <c ; j++){
            if(a[i][j]>maxc)
              maxc=a[i][j];
        }
    cout<<maxc<<endl;
    }
  
}