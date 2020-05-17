#include <iostream>
using namespace std;
#include<iomanip>

   int main()
   {
       int c,ar,ai,br,bi;
       cin>>c>>ar>>ai>>br>>bi;
       
       switch(c)
       {
            case 1:cout<<ar+br<<showpos<<ai+bi<<"i";
                    break;
            case 2:cout<<ar-br<<showpos<<ai-bi<<"i";
                    break;
            case 3: cout<<(ar*br)-(bi*ai)<<showpos<<(ar*bi)+(br*ai)<<"i";
                    break;
            default:
                    cout<<"Invalid choice";
       }    
   }