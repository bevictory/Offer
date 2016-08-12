package offer;
/**
 * ��Ŀ����
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * @author daiguohui
 *�����������ķ�ʽ��һ�ж�
 *���ж��У�ʹ�õݹ鷽ʽ�����ж�
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
