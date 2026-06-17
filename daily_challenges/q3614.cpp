#include <bits/stdc++.h>
using namespace std;

int main();

class Solution {
    using ll = long long;
public:
    char processStr(string s, long long k) {
        ll ans = 0;
        
        for (char el : s) {
            if (el == '*') ans = (ans == 0) ? ans : ans - 1;
            else if (el == '#') ans *= 2;
            else if (el == '%') ans = ans;
            else ans++;
        }
        if (k >= ans) return '.';

        for(int i = s.length() - 1; i >= 0; i--) {
            char el = s[i];

            if (el == '*') ans++;
            else if (el == '#') {
                ll mid = ans / 2;
                k = (k < mid) ? k : k - mid;
                ans /= 2;
            }
            else if (el == '%') {
                ll mid = ans / 2;
                k = 2 * mid - k;
                if (ans % 2 == 0) k--;
            }
            else {
                ans--;
                if (ans == k) return el;
            }
        }
        return '.';
    }
};