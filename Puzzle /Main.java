#include<iostream>
using namespace std;
int main()
{
    int c,r;
  cin>>r>>c;
  int a[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a[i][j];
        }
    }
  int res[c][r];
  for(int i = 0; i < c; i++){
        for(int j = 0; j < r; j++){
            res[i][j]=a[j][i];
        }
    }
  for(int i = 0; i < c; i++){
        for(int j = 0; j < r; j++){
            std::cout<<res[i][j]<<" ";
        }
    cout<<endl;
    }
}