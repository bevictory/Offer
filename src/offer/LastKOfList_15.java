package offer;
/**
 * ��Ŀ����
 * ����һ����������������е�����k����㡣
 * @author daiguohui
 *
 *ͨ��������ͬ��λ�ÿ�ʼ�ı���ȷ������Kλ�õĽڵ�
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
