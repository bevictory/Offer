package offer;

public class FindFirstCommonNode_37 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 if(pHead1==null || pHead2==null) return null;
		 int length1= getLength(pHead1);
		 int length2= getLength(pHead2);
		 int dis = length1 > length2 ?length1 -length2:length2-length1;
		 ListNode longList,shorList;
		 if(length1>length2){
			 longList = pHead1;
			 shorList = pHead2;
		 }else {
			 longList = pHead2;
			 shorList = pHead1;
		 }
		 for(int i =0;i<dis;i++){
			 longList=longList.next;
		 }
		 while(longList!=null&&shorList!=null&&longList!=shorList){
			 longList=longList.next;
			 shorList = shorList.next;
		 }
		 return longList;
    }
	public int getLength(ListNode root){
		ListNode head = root;
		int length = 0;
		while(head!=null){
			length++;
			head = head.next;
		}
		return length;
	}
}
