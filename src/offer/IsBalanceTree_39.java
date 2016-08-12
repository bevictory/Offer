package offer;

class depth{
	int val ;
	public depth(int val){
		this.val = val;
	}
}
public class IsBalanceTree_39 {
	
	 public boolean IsBalanced_Solution(TreeNode root) {
	       depth dep = new depth(0);
	       return isBalance(root, dep);
	    }
	 public boolean isBalance(TreeNode root,depth dep){
		 
		 if(root == null) {
			 dep.val =0;
			 return true;
		 }
		 depth left=new depth(0),right=new depth(0);
		 if(isBalance(root.left, left)&&isBalance(root.right, right)){
			 int dif = left.val - right.val;
			 if(dif >=-1 && dif <=1){
				 dep.val = 1+(left.val>right.val?left.val:right.val);
				 return true;
			 }
		 }
		 return false;
	 }
}
