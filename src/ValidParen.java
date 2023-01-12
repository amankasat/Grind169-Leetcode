import java.util.Stack;

public class ValidParen {
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ')') {
                if((characterStack.empty()) || (characterStack.pop() != '(')) {
                    flag = false;
                    break;
                }
            }
            else if (currentChar == '}') {
                if((characterStack.empty()) || (characterStack.pop() != '{')) {
                    flag = false;
                    break;
                }
            }
            else if (currentChar == ']') {
                if((characterStack.empty()) || (characterStack.pop() != '[')) {
                    flag = false;
                    break;
                }
            }
            else
                characterStack.push(currentChar);
        }
        if(characterStack.empty())
            return flag;
        else return false;
    }

    public static void main(String[] args) {
        ValidParen obj = new ValidParen();
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("]"));
    }
}
