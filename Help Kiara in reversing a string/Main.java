#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[100], temp;
    int i, j;

    cin.get(str,50);
    j = strlen(str) - 1;
    i=0;
    while( i < j )
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
    cout  << str;
    return 0;
}