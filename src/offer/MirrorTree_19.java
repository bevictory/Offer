package offer;
/**
 * ��Ŀ����
 * ���������Ķ�����������任ΪԴ�������ľ���
 * @author daiguohui
 *
 *ͨ��
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
