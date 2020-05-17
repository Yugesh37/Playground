#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main()
{
	std::string s;
	getline(cin,s);
	std::string chars = "#1234567890^&*!@$&_";

	for (char c: chars) {
		s.erase(std::remove(s.begin(), s.end(), c), s.end());
	}

	std::cout << s;

	return 0;
}