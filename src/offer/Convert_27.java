package offer;
/**
 * 题目描述
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。 
 * @author daiguohui
 *
 *
 *本题中采用记录前一节点中序遍历的方法，
 *但一定要注意java中传参数是传值的，所以传参数会出现问题，一定要穿属性或成员变量进去
 */
public class Convert_27 {
//	public TreeNode Convert(TreeNode pRootOfTree) {
//        TreeNode lastNode= new TreeNode(0);
//        cv(pRootOfTree, lastNode);
//        TreeNode head = lastNode;
//        while(head!=null && head.left !=null){
//        	head = head.left;
//        }
//        return head;
//    }
//	public void cv(TreeNode root,TreeNode lastNode){
//		if(root == null){
//			return;
//		}
//		if(root.left != null){
//			cv(root.left, lastNode);
//		}
//		root.left  = lastNode;
//		if(lastNode!= null) lastNode.right = root;
//		lastNode = root;
//		System.out.println(lastNode.val);
//		if(root.right != null){
//			cv(root.right, lastNode);
//		}
//		
//	}
	
	
	 TreeNode lastNode=null;
	   public TreeNode Convert(TreeNode pRootOfTree) {
	       
	        cv(pRootOfTree);
	        TreeNode head = lastNode;
	        while(head!=null && head.left !=null){
	        	head = head.left;
	        }
	        return head;
	    }
		public void cv(TreeNode root){
			if(root == null){
				return;
			}
	        
			if(root.left != null){
				cv(root.left);
			}
			root.left  = lastNode;
			if(lastNode!= null) lastNode.right = root;
			lastNode = root;
	        
	   
			if(root.right != null){
				cv(root.right);
			}
			
		}
}
