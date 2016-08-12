package offer;

import java.util.ArrayList;
/**
 * 题目描述
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author daiguohui
 *
 */
public class FindPath_25 {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        int curSum = 0;
        if(root ==null) return result;
        ArrayList<Integer> path = new ArrayList<>();
        fp(root, target, path, curSum);
        return result;
    }
	public void fp(TreeNode root,int target, ArrayList<Integer> path, int curSum){
		curSum += root.val;
		path.add(root.val);
		boolean isLeaf = root.left == null && root.right == null;
		if(curSum == target && isLeaf){
			ArrayList<Integer> tmpArrayList =new ArrayList<>(path);
			result.add(tmpArrayList);
		}
		if(root.left!= null){
			fp(root.left, target, path, curSum);
		}
		if(root.right!= null){
			fp(root.right, target, path, curSum);
		}
		path.remove(path.indexOf(root.val));
		
	}
}
