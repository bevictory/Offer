package offer;

import java.util.ArrayList;

/**
 * ��Ŀ����
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ�� 
 * @author daiguohui
 * ����ʹ��ջ�ṹ�����Ҳ����ʹ�õݹ�ķ�ʽ���
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
