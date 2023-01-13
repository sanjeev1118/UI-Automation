package problem_conding;

import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int[] arr = {40, 5, 2, 25};

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            if(!stack.isEmpty() && stack.lastElement()< arr[i]) {
                System.out.println(stack.lastElement() + "---> "+ arr[i]);
                stack.pop();
            }
            else if(stack.peek() > arr[i])
                System.out.println(stack.peek() + "--> "+ -1);
            stack.push(arr[i]);
        }
        System.out.println(stack.peek() + "--> "+ -1);
        System.out.println(stack.toString());
    }
}
