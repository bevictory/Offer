package offer;
/**
 * ��Ŀ����
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ� 
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
