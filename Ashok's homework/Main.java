#include<iostream>
using namespace std;

int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  int b[r][c];
  int res[r][c];
for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
    }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>b[i][j];
        }
    }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            res[i][j]=a[i][j]+b[i][j];
        }
    }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cout<<res[i][j]<<" ";
        }
    cout<<endl;
    }
  
}