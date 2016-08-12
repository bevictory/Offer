package offer;
/**
 * 题目描述
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * @author daiguohui
 *
 *
 *题目中需要加入判断链表是否为空
 *链表反转的步骤很简单，使用三个节点，分别表示前中后，然后对这链接关系进行变更
 *将中间节点的后置节点指向前置节点，中间节点与后置节点失去了联系，后节点保存了这种关系
 */
public class ReverseList_16 {
	public ListNode ReverseList(ListNode head) {
		if(head ==null){
			System.out.println();
			return null;
		}
		ListNode reverseNode = null,pre,cur,next;
		cur = head;
		next = null;
		pre = null;
		while(cur !=null){
			next = cur.next;
			
			cur.next = pre;
            if(next ==null){
				reverseNode = cur;
                
                break;
			}
			pre = cur;
			cur = next;
            
		}
      
		cur = reverseNode;
		while(cur.next!=null){
			System.out.print(cur.val);
            cur= cur.next;
		}
		System.out.println();
		return reverseNode;
    }
}
