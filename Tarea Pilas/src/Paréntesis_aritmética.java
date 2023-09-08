import java.util.Stack;

public class Paréntesis_aritmética {
    
    public static void main(String[] args) {
        String expression1 = "{([()])}";
        String expression2 = "({[])}";
        System.out.println(expression1);
        System.out.println(expression2);
        boolean result1 = balancedDelimiters(expression1);
        boolean result2 = balancedDelimiters(expression2);
        System.out.println("Expression 1 is balanced: " + result1);
        System.out.println("Expression 2 is balanced: " + result2);
    }
    
    public static boolean balancedDelimiters(String expression) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.pop();
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}

}
