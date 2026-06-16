#include <bits/stdc++.h>
using namespace std;

int main();

class Solution {
public:
    string processStr(string s) {
        string result = "";

        for(char i : s) {
            if (result.size() != 0) {
                if (i == '*') result.pop_back();
                if (i == '#') result.append(result);
                if (i == '%') reverse(result.begin(), result.end());
            }
            if (i >= 'a' && i <= 'z') result += i;
        }

        return result;
    }
};