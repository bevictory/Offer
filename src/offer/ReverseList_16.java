package offer;
/**
 * ��Ŀ����
 * ����һ��������ת�����������������Ԫ�ء�
 * @author daiguohui
 *
 *
 *��Ŀ����Ҫ�����ж������Ƿ�Ϊ��
 *����ת�Ĳ���ܼ򵥣�ʹ�������ڵ㣬�ֱ��ʾǰ�к�Ȼ��������ӹ�ϵ���б��
 *���м�ڵ�ĺ��ýڵ�ָ��ǰ�ýڵ㣬�м�ڵ�����ýڵ�ʧȥ����ϵ����ڵ㱣�������ֹ�ϵ
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
