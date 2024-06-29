/*
 * @lc app=leetcode id=2 lang=cpp
 *
 * [2] Add Two Numbers
 */
#include <iostream>
// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

// struct ListNode {
//       int val;
//       ListNode *next;
//       ListNode() : val(0), next(nullptr) {}
//       ListNode(int x) : val(x), next(nullptr) {}
//       ListNode(int x, ListNode *next) : val(x), next(next) {}
//  };

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head = new ListNode(0);
        ListNode* curr = head;
        int sum = 0;
        int carry_digit = 0;
        int v1;
        int v2;
        while (l1 != nullptr || l2 != nullptr){
            if(l1 != nullptr) v1 = l1->val;
            else v1 = 0;
            
            if(l2 != nullptr) v2 = l2->val;
            else v2 = 0;
            
            sum = v1 + v2 + carry_digit;
            curr->next = new ListNode(sum % 10);
            curr = curr->next;
            carry_digit = sum / 10;
            
            if (l1 != nullptr) l1 = l1->next;
            if (l2 != nullptr) l2 = l2->next;
        }

        if (carry_digit > 0)
            curr->next = new ListNode(carry_digit);
        return head->next;
    }
};

// int main(){
//     // Creating first number: 342 represented as 2 -> 4 -> 3
//     ListNode* l1 = new ListNode(2);
//     l1->next = new ListNode(4);
//     l1->next->next = new ListNode(3);

//     // Creating second number: 465 represented as 5 -> 6 -> 4
//     ListNode* l2 = new ListNode(5);
//     l2->next = new ListNode(6);
//     l2->next->next = new ListNode(4);
//     //test
//     Solution s;
//     ListNode* bruh = s.addTwoNumbers(l1,l2);

//     while (bruh != nullptr){
//         std::cout << bruh->val;
//         std::cout << " ";
//         bruh = bruh -> next;
//     }
//     return 0;
// }
// @lc code=end

