class Solution {
    public boolean isMatch(String s, String p) {
        // Initialize two pointers to track the current position in s and p
        int i = 0;
        int j = 0;
        // Initialize a variable to store the last position of '*' in p
        int star = -1;
        // Initialize a variable to store the last position of s that matches '*'
        int match = -1;
        // Loop through s
        while (i < s.length()) {
            // If the current characters in s and p match, or p has '?', move both pointers forward
            if (j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            }
            // If p has '*', update the star and match variables, and move the pointer in p forward
            else if (j < p.length() && p.charAt(j) == '*') {
                star = j;
                match = i;
                j++;
            }
            // If the current characters do not match, and there is a previous '*', backtrack to the last '*' and move the pointer in s forward
            else if (star != -1) {
                j = star + 1;
                match++;
                i = match;
            }
            // If none of the above cases apply, return false
            else {
                return false;
            }
        }
        // Loop through the remaining characters in p, and return false if any of them is not '*'
        while (j < p.length()) {
            if (p.charAt(j) != '*') {
                return false;
            }
            j++;
        }
        // Return true if both pointers reach the end of s and p
        return true;
    }
}