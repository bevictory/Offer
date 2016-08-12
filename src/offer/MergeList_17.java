package offer;
/**
 * 
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author daiguohui
 *
 *
 *合并两个链表的方法很简单，多注意不要让链接过程断掉。
 */
public class MergeList_17 {
	public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode mergeList = new ListNode(0);
        ListNode head = mergeList;
        while(list1!=null&& list2 !=null){
        	if(list1.val < list2.val){
        		mergeList.next = list1;
        		mergeList = mergeList.next; 
        		list1 = list1.next;
        	}else {
        		mergeList.next = list2;
        		mergeList = mergeList.next; 
        		list2 = list2.next;
        	}
        }
        if(list1!= null){
        	mergeList.next = list1;
        }
        if(list2 != null){
        	mergeList.next = list2;
        }
        return head.next;
    }
}
