package offer;

import java.sql.Date;
import java.util.Stack;
/**
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。 
 * @author daiguohui
 *
 */
public class MinStack_21 {
	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	public void push(int node) {
        data.push(node);
        if(min.size()==0 ||node < min.peek()){
        	min.push(node);
        }else min.push(min.peek());
        
    }
    
    public void pop() {
        min.pop();
        data.pop();
    }
    
    public int top() {
        return  data.peek();
    }
    
    public int min() {
        return min.peek();
    }
}
