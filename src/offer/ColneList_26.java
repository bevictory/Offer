package offer;
/**
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空） 
 * @author daiguohui
 *
 */
public class ColneList_26 {
	public RandomListNode Clone(RandomListNode pHead)
    {
        colne(pHead);
        connectRandom(pHead);
        return remove(pHead);
    }
	public void colne(RandomListNode pHead){
		RandomListNode head = pHead;
		while(head!=null){
			RandomListNode node = new RandomListNode(head.label);
			RandomListNode next = head.next;
			head.next =node;
			node.next = next;
			head = next;
		}
	}
	public void connectRandom(RandomListNode pHead){
		RandomListNode head = pHead;
		while(head!=null){
			
			if(head.random!=null)
				head.next.random = head.random.next;
			head = head.next.next;
		}
	}
	public RandomListNode remove(RandomListNode pHead){
		RandomListNode head = pHead;
		RandomListNode newHead = pHead!=null?pHead.next:null;
		RandomListNode cloneListNode= newHead;
        if(cloneListNode ==null) return null;
		while(cloneListNode.next!=null){
			head.next = cloneListNode.next;
			cloneListNode.next = head.next.next;
			head= head.next;
			cloneListNode= cloneListNode.next;
		}
		head.next=null;
		return newHead;
	}
//	RandomListNode head = pHead;
//	RandomListNode newHead = pHead!=null?pHead.next:null;
//	RandomListNode cloneListNode= newHead;
//	if(head!=null){
//		head.next= cloneListNode.next;
//		head = head.next;
//		
//	}
//	while(head!=null){
//		cloneListNode .next = head.next;
//		cloneListNode = cloneListNode.next;
//		head.next = cloneListNode.next;
//		head = head.next;
//	}
//	return newHead;
}
