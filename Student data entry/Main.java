#include <iostream>
using namespace std;

struct student
{
    char name[50];
    int roll;
    float marks;
};

int main() 
{
   student s[10];
  
    
	cin.get(s[0].name,100);
  cout<<endl;
  
    cin >> s[0].roll;
    
    cin >> s[0].marks;

    cout << "Student Details" << endl;
    cout << "Name: " <<s[0].name << endl;
    cout << "Roll: " <<s[0].roll<< endl;
    cout << "Marks: " <<s[0].marks<< endl;
    return 0;
}