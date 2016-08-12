package offer;

import java.util.Scanner;
import java.util.Stack;
class ListNode2{
	public ListNode2(int val) {
		// TODO Auto-generated constructor stub
		value = val;
		next = null;
	}
	int value; 
	ListNode2 next;
}
public class PrintListReverse5_1511 {
	private ListNode2 listNode;
	private ListNode2 cur;
	public void buildList(){
		Scanner scanner = new Scanner(System.in);
		int n=0;
		while((n=scanner.nextInt())!=-1){
			if(listNode == null) {
				listNode = new ListNode2(n);
				cur = listNode;
			}else 
			{
				cur.next = new ListNode2(n);
				cur = cur.next;
			}
		}
	}
	public void printListReverse(){
		Stack<Integer> stack = new Stack<Integer>();
		cur = listNode;
		while(cur !=null){
			stack.push(cur.value);
			cur = cur.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	public static void main(String []args){
		PrintListReverse5_1511 s = new PrintListReverse5_1511();
		s.buildList();
		s.printListReverse();
	}
}
