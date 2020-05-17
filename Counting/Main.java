#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[200];
    int v = 0, c = 0, n = 0, s = 0,white=0;
   
    cin.get(str,200);
  	int l = strlen(str);
    for (int i = 0; i<l; ++i)
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
            ++v;
        else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
                ++c;
             else if (str[i] >= '0' && str[i] <= '9')
                      ++n;
      		else if(str[i]==' ')
              		++white;
                  else
                      ++s;
    }
    cout << "Vowels:" << v<<endl;
    cout << "Consonants:" << c<<endl;
    cout << "White Spaces:" << white<<endl;
  cout<<"Digits:"<<n<<endl;
    cout << "Symbols:" << s<<endl;
    return 0;
}