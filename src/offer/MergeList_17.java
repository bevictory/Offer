package offer;
/**
 * 
 * ��Ŀ����
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * @author daiguohui
 *
 *
 *�ϲ���������ķ����ܼ򵥣���ע�ⲻҪ�����ӹ��̶ϵ���
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
