import java.util.Stack;

public class ValidParenthesesExamples {

	public static void main(String[] args) {
		// Test cases
		System.out.println(isValid("()")); // true
		System.out.println(isValid("()[]{}")); // true
		System.out.println(isValid("{[]}")); // true
		System.out.println(isValid("((()))")); // true
		System.out.println(isValid("{[()]}")); // true
		System.out.println(isValid("")); // true (empty string)
		System.out.println(isValid("([{}])")); // true
		System.out.println(isValid("{()}[]")); // true
		// Test cases
		System.out.println(isValid("(]")); // false - wrong closing
		System.out.println(isValid("([)]")); // false - interleaved
		System.out.println(isValid("((")); // false - unmatched opening
		System.out.println(isValid("))")); // false - unmatched closing
		System.out.println(isValid("{[}]")); // false - wrong order
		System.out.println(isValid("(")); // false - single opening
		System.out.println(isValid(")")); // false - single closing
		System.out.println(isValid("{[(])}")); // false - mixed up
		System.out.println(isValid("({[")); // false - all opening
		System.out.println(isValid("}])")); // false - all closing
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if ((c == ')' && top != '(') || 
					(c == '}' && top != '{') || 
					(c == ']' && top != '[')) {
					return false;
				}

			}
			

		}

		return stack.isEmpty();

	}

}
