#include <bits/stdc++.h>
using namespace std;

int main();

class Solution1
{
public:
    vector<int> pivotArray(vector<int> &nums, int pivot)
    {
        list<int> less;
        list<int> equal;
        list<int> greater;

        for (int num : nums)
        {
            if (num < pivot)
                less.push_back(num);
            if (num == pivot)
                equal.push_back(num);
            if (num > pivot)
                greater.push_back(num);
        }

        less.insert(less.end(), equal.begin(), equal.end());
        less.insert(less.end(), greater.begin(), greater.end());

        vector<int> ans;
        for (auto i : less)
        {
            ans.push_back(i);
        }

        return ans;
    }
};

class Solution2
{
public:
    vector<int> pivotArray(vector<int> &nums, int pivot)
    {
        vector<int> ans;

        for (int num : nums)
        {
            if (num < pivot)
                ans.push_back(num);
        }

        for (int num : nums)
        {
            if (num == pivot)
                ans.push_back(num);
        }

        for (int num : nums)
        {
            if (num > pivot)
                ans.push_back(num);
        }

        return ans;
    }
}