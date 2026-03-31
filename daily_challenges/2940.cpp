#include <iostream>
#include <string>
#include <map>

using namespace std;

int main() {

}

class Solution1 {
public:
    bool checkStrings(string s1, string s2) {
        int n = s1.length();

        map<char, int> s1e, s1o, s2e, s2o;

        for(int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s1e[s1[i]]++;
                s2e[s2[i]]++;
            }

            else {
                s1o[s1[i]]++;
                s2o[s2[i]]++;
            }
        }

        return (s1e == s2e && s1o == s2o);

    }
};