package offer;
/**
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author daiguohui
 *遍历二叉树的方式逐一判断
 *在判断中，使用递归方式进行判断
 */
public class HasSubTree_18 {
	 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	        boolean result = false;
			if(root1!=null && root2!=null){
	        	if(root1.val == root2.val){
	        		 result = isSame(root1, root2);
	        	}
	        	if(!result)
	        		result =  isSame(root1.left, root2);
	        	if(!result)
	        		result = isSame(root1.right, root2);
	        }
			return result;
			
	    }
		public boolean isSame(TreeNode root1, TreeNode root2){
			if(root2 ==null ){
				 return true;
				
			}
	        if(root1 ==null) return false;
			if(root1.val != root2.val){
				return false;
			}
			return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
		}
}
