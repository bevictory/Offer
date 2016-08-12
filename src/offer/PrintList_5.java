package offer;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。 
 * @author daiguohui
 * 可以使用栈结构输出，也可以使用递归的方式输出
 */
public class PrintList_5 {
	ArrayList<Integer> result = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode !=null)recursively(listNode);
        return result;
        
    }
	public void recursively(ListNode listNode){
		if(listNode !=null){
        	if(listNode.next !=null){
        		printListFromTailToHead(listNode.next);
        	}        
        	result.add(listNode.val);
		}
        
	}
}
