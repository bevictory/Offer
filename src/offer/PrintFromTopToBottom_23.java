package offer;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * ��Ŀ����
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author daiguohui
 *
 *
 *������BFS��Ӧ�ã�ʹ�ö��б�������Ľڵ㣬��ȱ���
 */
public class PrintFromTopToBottom_23 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		Queue<TreeNode> queue = new ConcurrentLinkedQueue<TreeNode>();
		ArrayList<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		queue.offer( root);
		while(!queue.isEmpty()){
			TreeNode tmp = queue.poll();
			result.add(tmp.val);
			
				if(tmp.left!=null) 
					queue.offer(tmp.left);
				if(tmp.right != null)
					queue.offer(tmp.right);
			
		}
		return result;
		
    }
}
