#include <bits/stdc++.h>
using namespace std;

int main();

class Solution1 {
public:
using ll = long long;
    long long maxTotalValue(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());

        int n = nums.size();
        ll sum = 0;
        ll i = nums[0];
        ll j = nums[n - 1];

        while (k--) {
            sum += j - i;
        }
        
        return sum;
    }
};

class Solution2 {
public:
using ll = long long;
    long long maxTotalValue(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());

        int n = nums.size();
        
        return 1LL * (nums[n - 1] - nums[0]) * k;
    }
};

class Solution3 {
public:
using ll = long long;
    long long maxTotalValue(vector<int>& nums, int k) {
        ll a = *max_element(nums.begin(), nums.end());
        ll b = *min_element(nums.begin(), nums.end());

        return 1LL * (a - b) * k;
    }
};