// Problem Description

// Given two binary strings A and B. Return their sum (also a binary string).


// Problem Constraints

// 1 <= length of A <= 105

// 1 <= length of B <= 105

// A and B are binary strings



// Input Format

// The two argument A and B are binary strings.



// Output Format

// Return a binary string denoting the sum of A and B



// Example Input

// Input 1:
// A = "100"
// B = "11"
// Input 2:
// A = "110"
// B = "10"


// Example Output

// Output 1:
// "111"
// Output 2:
// "1000"

public class Solution {

    public String addBinary(String A, String B) {
        StringBuilder result = new StringBuilder();
        int i = A.length() - 1, j = B.length() - 1, carry = 0;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += A.charAt(i--) - '0';
            if (j >= 0) sum += B.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        if (carry != 0) result.append(carry);
        
        return result.reverse().toString();
    }
}