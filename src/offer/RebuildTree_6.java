package offer;
/**
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。 
 * @author daiguohui
 *
 *
 *本题目中使用了递归的方法
 */
public class RebuildTree_6 {
	TreeNode rootNode;
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre ==null || in == null||in.length!= pre.length||pre.length ==0|| pre.length==0){
			return null;
		}
       return  construcTreeNode(pre, 0, pre.length-1, in, 0, in.length-1);
    }
	public TreeNode construcTreeNode (int []pre, int preBegin,int preEnd,
			int []in, int inBegin, int inEnd){
		TreeNode root ;
		root = new TreeNode(pre[preBegin]);
		root.left = null;
		root.right = null;
		int leftLength =0;
		int loc = inBegin;
		while(loc <= inEnd && in[loc] !=pre[preBegin]){
			leftLength ++;
			loc++;
		}
		if(leftLength > 0){
			root.left = construcTreeNode(pre, preBegin+1, preBegin+leftLength, in, inBegin, inBegin+leftLength-1);
		}
		if(preBegin + leftLength <preEnd){
			root.right = construcTreeNode(pre, preBegin+leftLength+1, preEnd, in, inBegin+leftLength+1, inEnd);
		}
		return root;
 	}
}
