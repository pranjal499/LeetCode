public class q151 {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String reverseWords(String s) {
        String sArr[] = s.trim().split("\\s+");

        String ansStr = "";
        for (int i = sArr.length - 1; i >= 0 ; i--) {
            ansStr += sArr[i];
            if (i != 0) ansStr += " ";
        }
        return ansStr;
    }
}