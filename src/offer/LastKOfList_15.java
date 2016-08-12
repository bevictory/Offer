package offer;
/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author daiguohui
 *
 *通过两个不同的位置开始的遍历确定倒数K位置的节点
 *
 */
public class LastKOfList_15 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head ==null||k==0) return null;
		ListNode  node = head;
		for(int i =0;i< k-1;i++){
			if(node.next ==null)
				return null;
			node = node.next;
		}
		while(node.next!=null){
			head =head.next;
			node =node.next;
		}
		return head;
    }
}
