package offer;

import java.util.Stack;

/**
 * ��Ŀ����
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author daiguohui
 *
 *
 *ջ���Ƚ�����ģ����������Ƚ��ȳ��ģ������ջ�е�������ջ�ٳ�ջ�ͻ������Ƚ��ȳ�
 *���Կ���ʹ������ջʵ�ֶ��еĹ���
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
