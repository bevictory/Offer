package offer;
/**
 * ��Ŀ����
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * @author daiguohui
 *
 */
public class TreeDepth_39 {
	public int TreeDepth(TreeNode pRoot)
    {
		if(pRoot==null) return 0;
		int left = TreeDepth(pRoot.left);
		int right = TreeDepth(pRoot.right);
		return (left>right) ? left+1:right+1;
    }
}
