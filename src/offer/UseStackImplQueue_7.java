package offer;

import java.util.Stack;

/**
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author daiguohui
 *
 *
 *栈是先进后出的，而队列是先进先出的，如果从栈中弹出再入栈再出栈就会变成了先进先出
 *所以可以使用两个栈实现队列的功能
 */
public class UseStackImplQueue_7 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.size() ==0){
    		if(stack1.size()!=0){
    			while(!stack1.isEmpty()){
    				stack2.push(stack1.pop());
    			}
    		}else {
    			
    		}
    	}
    	return stack2.pop();
    }
}
