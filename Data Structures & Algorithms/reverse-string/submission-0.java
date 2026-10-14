public class Solution {

    public void reverseString(char[] s) {

        int n = s.length;
        char[] tmp = new char[n];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            tmp[j] = s[i];
        }
        for (int i = 0; i < n; i++) {
            s[i] = tmp[i];
        }
    }
}