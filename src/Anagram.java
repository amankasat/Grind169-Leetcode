import java.util.HashMap;
import java.util.LinkedList;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        LinkedList<Character> charList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if(charList.contains(t.charAt(i)))
                charList.remove((Character) t.charAt(i));
            else
                return false;
        }
        return charList.isEmpty();
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> charList = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(charList.containsKey(s.charAt(i)))
                charList.put(s.charAt(i),charList.get(s.charAt(i))+1);
            else
                charList.put(s.charAt(i),1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(charList.containsKey(t.charAt(i))) {
                if(charList.get(t.charAt(i)) != 1)
                    charList.put(t.charAt(i), charList.get(t.charAt(i)) - 1);
                else
                    charList.remove(t.charAt(i));
            }
            else
                return false;
        }
        return charList.isEmpty();
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) {
            if(--alphabet[t.charAt(i) - 'a'] < 0)
                return false;
        }
        for (int i : alphabet) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
