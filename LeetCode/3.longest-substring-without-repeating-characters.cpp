/*
 * @lc app=leetcode id=3 lang=cpp
 *
 * [3] Longest Substring Without Repeating Characters
 */


// Suffix Trie/Tree is not ideal since in this case it is without repeating characters (also O(n log n))
// Need an ad-hoc solution for O(n)
// @lc code=start
#include<iostream>
#include <unordered_map>
#include <string>
using namespace std;
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        // Use a hash table to track character positions
        std::unordered_map<char, int> hashmap;
        long unsigned int left = 0, right = 0;
        long unsigned int maxLength = 0;
        while (right < s.size()) {
        char currentChar = s[right];
        if (hashmap.count(currentChar) > 0 && hashmap[currentChar] >= left) {
            left = hashmap[currentChar] + 1;
        }

        hashmap[currentChar] = right;

        maxLength = max(maxLength, right - left + 1);

        right++;
        }

        return maxLength;
    }
};
// @lc code=end

