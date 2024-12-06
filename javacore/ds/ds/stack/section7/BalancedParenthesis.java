package ds.stack.section7;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="{(})[]";
		String test1="{()}[]";
		String test2="abcd";
		expression e= new expression();
		System.out.println(e.isBalanced(test));
		System.out.println(e.isBalanced(test2));
		
		

	}

}


class expression{
	public static boolean isBalanced(String expression) {
//		boolean containsBrackets = false;
//        for (char ch : expression.toCharArray()) {
//            if (ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']') {
//                containsBrackets = true;
//                break;
//            }
//        }
//
//        // If no bracket symbols are found, return true
//        if (!containsBrackets) {
//            return true;
//        }
//	Stack<Character> stack =new Stack<>();
//	for(int i=0;i<expression.length();i++) {
//		char x= expression.charAt(i);
//		if(x=='('||x=='{'||x=='[') {
//			stack.push(x);
//			continue;
//		}
//		char check;
//		if(stack.isEmpty()) {
//			return false;
//		}
//		switch(x){
//		case ')':
//			check=stack.pop();
//			if(check=='{'||check=='[') {
//				return false;
//			}
//			break;
//		case '}':
//			check=stack.pop();
//			if(check=='('||check=='[') {
//				return false;
//			}
//			break;
//		case ']':
//			check=stack.pop();
//			if(check=='{'||check=='(') {
//				return false;
//			}
//			break;
//		}
//	}
//	return stack.isEmpty();
//	}
		
		//Alternative approach
		Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
