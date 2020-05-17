#include <cstdio>
#include <cstring>
#include <iostream>
using namespace std;


    int main() {
       
        int n ,c; //no of players including Sereja
       cin>>n>>c;

        int mugs[n];
        for (int i = 0; i < n; ++i) {
        cin>>mugs[i];
        }

       
        int t = 0;
        for (int i = 0; i < n ; ++i) {
            t += mugs[i];
    	}
      if(t<=c)
        cout<<"YES";
      else 
        cout<<"NO";
    }