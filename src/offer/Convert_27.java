package offer;
/**
 * ��Ŀ����
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ�� 
 * @author daiguohui
 *
 *
 *�����в��ü�¼ǰһ�ڵ���������ķ�����
 *��һ��Ҫע��java�д������Ǵ�ֵ�ģ����Դ�������������⣬һ��Ҫ�����Ի��Ա������ȥ
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
