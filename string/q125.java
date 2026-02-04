public class q125 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;

        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0, j = newS.length() - 1;

        while (i < j) {
            if (newS.charAt(i) != newS.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }
}