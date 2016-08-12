package offer;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author daiguohui
 *
 *
 *本题是BFS的应用，使用队列保存读过的节点，宽度遍历
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
