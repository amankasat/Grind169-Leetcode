import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sCopy = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch) || Character.isUpperCase(ch) || Character.isDigit(ch))
                sCopy.append(ch);
        }
        for (int i = 0; i < sCopy.length()/2; i++) {
            if (sCopy.charAt(i) != sCopy.charAt(sCopy.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((isPalindrome("\"A man, plan, a canal: Panama\"")));
    }
}
