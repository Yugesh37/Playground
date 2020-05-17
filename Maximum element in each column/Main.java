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

  for(int i = 0; i < c; i++){
    		int maxc=a[0][i];
        for(int j = 0; j < r; j++){
            if(a[j][i]>maxc)
              maxc=a[j][i];
        }
    cout<<maxc<<endl;
    }
  
}