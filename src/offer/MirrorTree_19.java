package offer;
/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * @author daiguohui
 *
 *通过
 */
public class MirrorTree_19 {
	public void Mirror(TreeNode root) {
        if(root == null) return ;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
